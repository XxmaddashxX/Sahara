/**
 * 
 */
package net.thesahara.engine;

import net.thesahara.engine.util.TextureHandler;
import net.thesahara.game.player.Player;

import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - Shooting.java
 *@author Greg
 *
 */
public class Shooting {
	private  int log;
	public String name;
	public  int posx;
	public  int posy;
	public  int dir;
	public static boolean isVisible;
	public Shooting(){
		
		
	}
	public  void setDir(Player player){
		dir = player.getDirection();
	}
	public   void fire(Player player){
		if(log == 0){
			posx = player.getPlayerX();
			posy = player.getPlayerY();
		}
		if(log < 150){
			isVisible = true;
			if(dir == 3){
				posx = posx +5; 
				log = log + 5;
				
			}
			if(dir == 1){
				posx = posx - 5;
				log = log + 5;
			}
			if(dir == 0){
				posy = posy - 5;
				log = log + 5;
			}
			if(dir == 2){
				posy = posy + 5;
				log = log + 5;
			}
			if(dir == 4){
				posx =  posx + 5;
				posy = posy - 5;
				log = log + 5;
			}
		}
		else{
			log = 0;
			isVisible = false;
		}
		drawShot();
		
	}
	public void drawShot(){
		Texture temp = TextureHandler.loadTexture("programicon", "PNG");
		TextureHandler.drawTexture(temp, posx, posy);
		
	}


}
