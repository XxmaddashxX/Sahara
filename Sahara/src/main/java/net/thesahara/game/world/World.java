/**
 * 
 */
package net.thesahara.game.world;

import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - World.java
 *@author Greg
 *
 */
public class World {
	public static String worldname;
	private static Texture worldTexture;
	public static boolean isRunning;
	public World(String name, Texture texture){
		this.isRunning = true;
		this.worldTexture = texture;
		this.worldname = name;
	}
	public static String getWorldname() {
		return worldname;
	}
	public static Texture getWorldTexture() {
		return worldTexture;
	}
	public static void worldStart(){
		
		
		worldLoop();
	}
	public static void worldLoop(){
		
		while(isRunning){
			input();
			update();
			render();
		}
		worldClose();
		
	}
	public static void render(){
		
	}
	public static void update(){
		
	}
	public static void input(){
		
	}
	public static void worldClose(){
		
	}
	

}