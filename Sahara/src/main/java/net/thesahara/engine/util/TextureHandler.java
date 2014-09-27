package net.thesahara.engine.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import static org.lwjgl.opengl.GL11.*;

public class TextureHandler {


	public static Texture loadTexture(String key, String format){
		try {
			return TextureLoader.getTexture(format, new FileInputStream(new File("src/main/resources/assets/sahara/textures/" + key + "." + format.toLowerCase())));
		} catch (IOException e) {

			e.printStackTrace();

		}
		return null;
	}
	public static Texture loadTexture(String folder, String key, String format){
		try {
			return TextureLoader.getTexture(format, new FileInputStream(new File("src/main/resources/assets/sahara/textures/" + folder + "/" + key + "." + format.toLowerCase())));
		} catch (IOException e) {

			e.printStackTrace();

		}
		return null;
	}
	public static void drawTexture(Texture texture, float posX, float posY){
		
		
		org.newdawn.slick.Color.white.bind();
		texture.bind();
		// Draw a textured quad
		glBegin(GL_QUADS);
		glTexCoord2f(0, 0); glVertex2f(posX, posY);
		glTexCoord2f(0, 1); glVertex2f(posX, posY +texture.getTextureHeight());
		glTexCoord2f(1, 1); glVertex2f(posX +texture.getTextureWidth(), posY +texture.getTextureHeight());
		glTexCoord2f(1, 0); glVertex2f(posX + texture.getTextureWidth(), posY);
		glEnd();


		
		


		

	}


}
