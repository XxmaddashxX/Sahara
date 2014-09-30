/**
 * 
 */
package net.thesahara.engine;

import org.lwjgl.opengl.Display;

import net.thesahara.engine.render.TextureStorage;
import net.thesahara.engine.util.TextureHandler;
import net.thesahara.game.player.Player;

/**
 *The Sahara - Shooting.java
 *@author Greg
 *
 */
public class Shooting {
	private static int log;
	public static String name;
	public static int posx, posy;
	public static int dir;
	public static boolean isVisible;
	public Shooting(String name){
		this.name = name;
		
	}
	public static void setDir(Player player){
		dir = player.getDirection();
	}
	public static void fire(Player player){
		if(log == 0){
			posx = player.getPlayerX();
			posy = player.getPlayerY();
		}
		if(log < 150){
			isVisible = true;
			if(dir == 3){
				posx = posx +1; 
				log = log + 1;
				
			}
		}
		else{
			log = 0;
			isVisible = false;
		}
		
	}


}
