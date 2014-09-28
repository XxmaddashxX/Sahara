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
	private static int range = 3;
	public static void shoot(Player player){
		int r = range * 50;
		int dir = player.getDirection();
		if(dir == 0){
			
			for(int i = player.getPlayerX(); i < player.getPlayerX() + r; i++){
				
				TextureHandler.drawTexture(TextureStorage.test_Texture, player.getPlayerX() + i, player.getPlayerY());
				Display.update();
			
			}
		}
	}
	

}
