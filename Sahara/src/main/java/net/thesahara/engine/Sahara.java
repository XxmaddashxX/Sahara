package net.thesahara.engine;


import net.thesahara.game.SaharaProps;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

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


		while (!Display.isCloseRequested()) {
			input();
			update();
			render();


			Display.update();
		}

		Display.destroy();
	}
	
	private static void initializeGL(){
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
		glMatrixMode(GL_MODELVIEW);
		glDisable(GL_DEPTH_TEST);
		glClearColor(0,0,0,0);
	}
	private static void input(){
		
	}
	private static void render(){
		glClear(GL_COLOR_BUFFER_BIT);
		glLoadIdentity();
		
		
		Display.update();
	}
	private static void update(){
		
	}
	


}
