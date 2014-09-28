package net.thesahara.engine.render;

import net.thesahara.engine.util.TextureHandler;

import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - TextureStorage.java
 *@author Greg
 *
 */
public class TextureStorage {
	
	public static Texture test_Texture;
	public static Texture test2;
	public static Texture test3;
	
	public static Texture splash_START_Texture;
	
	
	public static void loadTextures(){
		test_Texture = TextureHandler.loadTexture("programIcon", "PNG");
		//test2 = TextureHandler.loadTexture("test2", "PNG");
		test3 = TextureHandler.loadTexture("test2_Texture", "PNG");
		
		
		//Splashes
		//splash_START_Texture = TextureHandler.loadTexture("splahes", "splash_START", "PNG");
	}
	

}
