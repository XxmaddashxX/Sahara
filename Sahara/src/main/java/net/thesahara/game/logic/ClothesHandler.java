/**
 * 
 */
package net.thesahara.game.logic;

import net.thesahara.engine.util.TextureHandler;
import net.thesahara.game.player.Player;

/**
 *The Sahara - ClotheHandler.java
 *@author Greg
 *
 */
public class ClothesHandler {

	
	public static void drawClothes(Player player){
		int x = player.getPlayerX();
		int y = player.getPlayerY();
		TextureHandler.drawTexture(player.getClothesbottom().getTexture(), x, y);
	}
	
		
	
		
		
	
	
}
