package net.thesahara.engine.render;

import net.thesahara.engine.util.TextureHandler;

import org.newdawn.slick.opengl.Texture;

public class TextureStorage {
	
	public static Texture testTexture;
	
	
	public static void loadTextures(){
		testTexture = TextureHandler.loadTexture("programIcon", "PNG");
	}
	

}