package net.thesahara.engine.displays;

import net.thesahara.engine.render.TextureStorage;
import net.thesahara.engine.util.TextureHandler;

import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - DisplaySplash.java
 *@author Greg
 *
 */
public class DisplaySplash {
	
	public static void drawSplashScreen(){
		Texture texture = TextureStorage.test_Texture;
		TextureHandler.drawTexture(texture, 10, 10);
	}
	
	
	

}
