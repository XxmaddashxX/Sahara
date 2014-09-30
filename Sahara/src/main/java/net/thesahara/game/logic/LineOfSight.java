/**
 * 
 */
package net.thesahara.game.logic;

import net.thesahara.game.player.Enemy;
import net.thesahara.game.player.Player;

/**
 *The Sahara - LineOfSight.java
 *@author Greg
 *
 */
public class LineOfSight {
	
	
	
	public static boolean canSee(Enemy enemy, Player player){
		if(player.getPlayerX() < enemy.getPlayerX() + 200 && player.getPlayerX() > enemy.getPlayerX() - 200){
			if(player.getPlayerY() < enemy.getPlayerY() + 200 && player.getPlayerY() > enemy.getPlayerY() - 200){
				return true;
		
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		
		
		
	}

}
