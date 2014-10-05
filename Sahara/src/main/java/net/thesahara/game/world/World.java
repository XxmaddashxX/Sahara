/**
 * 
 */
package net.thesahara.game.world;

//import java.util.Random;

import net.thesahara.engine.render.TextureStorage;
import net.thesahara.game.player.Player;

import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - World.java
 *@author Greg
 *
 */
public class World {
	public  String worldname;
	private Texture worldTexture;
	public  boolean isRunning;
	public  Player player;
	public  int spawnx;
	public  int spawny;
	//private  Random rand = new Random();
	public World(String name, Texture texture){
		this.isRunning = true;
		this.worldTexture = texture;
		this.worldname = name;
	}
	public World(String preload){
		this.isRunning = true;
		
	}
	public  String getWorldname() {
		return worldname;
	}
	public  Texture getWorldTexture() {
		return worldTexture;
	}
	public  void worldStart(){
		player = new Player("Test", TextureStorage.balkoose_pur_naked);
		
		
		worldLoop();
	}
	public  void worldLoop(){
		
		while(isRunning){
			input();
			update();
			render();
		}
		worldClose();
		
	}
	public  void render(){
		
	}
	public  void update(){
		
	}
	public  void input(){
		
	}
	public  void worldClose(){
		
	}
	

}
