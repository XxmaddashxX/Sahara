package net.thesahara.engine;


import static org.lwjgl.opengl.GL11.*;

import java.util.concurrent.TimeUnit;

import net.thesahara.engine.displays.DisplaySplash;
import net.thesahara.engine.render.TextureStorage;
import net.thesahara.engine.util.TextureHandler;
import net.thesahara.game.SaharaProps;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;


/**
 *The Sahara - Sahara.java
 *@author Greg
 *
 */
public class Sahara {

	
	public Sahara(){
		
	}
	
	public static void start() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.setResizable(true);
			
			Display.setTitle("Sahara " + SaharaProps.VERSION);
			Display.sync(60);
			Display.setVSyncEnabled(true);
			
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		initializeGL();
		TextureStorage.loadTextures();
		displaySplashs();
		while (!Display.isCloseRequested()) {
			input();
			update();
			render();


			
		}

		Display.destroy();
	}
	
	private static void initializeGL(){
		glEnable(GL11.GL_TEXTURE_2D);
		glClearColor(0,0,0,0);
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		glViewport(0, 0, Display.getWidth(), Display.getHeight());
		glMatrixMode(GL_MODELVIEW);
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	private static void input(){
		try {
			Keyboard.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	private static void render(){
		glClear(GL_COLOR_BUFFER_BIT);
		glLoadIdentity();
		TextureHandler.drawTexture(TextureStorage.test_Texture, 20, 20);
		
		Display.update();
	}
	private static void update(){
		
	}
	private static void displaySplashs(){
		glClear(GL_COLOR_BUFFER_BIT);
		glLoadIdentity();
		DisplaySplash.drawSplashScreen();
		Display.update();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
