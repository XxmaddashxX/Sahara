package net.thesahara.engine;


import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glViewport;

import java.util.concurrent.TimeUnit;

import net.thesahara.engine.displays.DisplaySplash;
import net.thesahara.engine.render.TextureStorage;
import net.thesahara.engine.util.TextureHandler;
import net.thesahara.game.SaharaProps;
import net.thesahara.game.logic.NameGenerator;
import net.thesahara.game.logic.threads.ShootingThread;
import net.thesahara.game.player.Civilian;
import net.thesahara.game.player.Enemy;
import net.thesahara.game.player.Player;

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
	public static Civilian civ;
	public static Player player;
	public static Enemy enemy;
	public static Enemy enemy2;
	public static boolean testing;
	public static Shooting shoot;
	
	public static int i;
	public Sahara(){
		 i = 0;
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
		civ = new Civilian("t", TextureStorage.balkoose_pur_naked);
		shoot = new Shooting("y");
		civ.setPlayerX(50);
		civ.setPlayerY(50);
		player = new Player("Test", TextureStorage.balkoose_pur_clothed);
		player.setPlayerX(50);
		player.setPlayerY(50);
		player.setDirection(0);
		enemy = new Enemy("bob", TextureStorage.icon, player);
		enemy.setPlayerX(500);
		enemy.setPlayerY(500);
		enemy2 = new Enemy("bob2", TextureStorage.balkoose_smuggler, player);
		enemy2.setPlayerX(400);
		enemy2.setPlayerY(400);
		System.out.println(NameGenerator.getName("Balkoose"));
		while (!Display.isCloseRequested()) {
			
			input();
			update();
			render();
			//Font --> 

			
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
			if(Keyboard.isKeyDown(Keyboard.KEY_D)){
				player.moveRight();
				player.setDirection(3);
				
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_S)){
				player.moveDown();
				player.setDirection(2);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_A)){
				player.moveLeft();
				player.setDirection(1);
				
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_W)){
				player.moveUp();
				player.setDirection(0);
			}
			if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)){
				Shooting.setDir(player);
				Shooting.isVisible = true;
				
				
			}
			
			
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
	}
	private static void render(){
		glClear(GL_COLOR_BUFFER_BIT);
		glLoadIdentity();
		TextureHandler.drawTexture(TextureStorage.balkoose_pur_naked, civ.getPlayerX(),civ.getPlayerY());
		TextureHandler.drawTexture(TextureStorage.icon, enemy.getPlayerX(), enemy.getPlayerY());
		TextureHandler.drawTexture(TextureStorage.balkoose_pur_clothed, player.getPlayerX(), player.getPlayerY());
		TextureHandler.drawTexture(TextureStorage.balkoose_smuggler, enemy2.getPlayerX(), enemy2.getPlayerY());
		if(Shooting.isVisible){
			TextureHandler.drawTexture(TextureStorage.test_Texture, Shooting.posx, Shooting.posy);
		}
		Display.update();
	}
	private static void update(){
		civ.onUpdate();
		enemy.onUpdate();
		if(Shooting.isVisible){
			Shooting.fire(player);
		}
		//enemy2.onUpdate();
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
