package net.thesahara.engine.render;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClear;
import net.thesahara.engine.util.TextureHandler;

import org.newdawn.slick.opengl.Texture;

public class TextureStorage {
	
	public static Texture test_Texture;
	public static Texture test2;
	
	
	public static Texture splash_START_Texture;
	
	
	public static void loadTextures(){
		test_Texture = TextureHandler.loadTexture("programIcon", "PNG");
		test2 = TextureHandler.loadTexture("test2", "PNG");
		
		
		
		//Splashes
		//splash_START_Texture = TextureHandler.loadTexture("splahes", "splash_START", "PNG");
	}
	

}
