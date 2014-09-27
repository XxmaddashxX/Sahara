package net.thesahara.engine.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class TextureHandler {


	public static Texture loadTexture(String key, String format){
		try {
			return TextureLoader.getTexture(format, new FileInputStream(new File("src/main/resources/assets/sahara/textures/" + key + format)));
		} catch (IOException e) {

			e.printStackTrace();

		}
		return null;
	}


}
