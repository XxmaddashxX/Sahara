/**
 * 
 */
package net.thesahara.game.player;

import net.thesahara.game.logic.LineOfSight;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - Enemy.java
 *@author Greg
 *
 */
public class Enemy extends EnemyBase{
	public Player player;
	public int textwidth, textheight;
	public Enemy(String name, Texture texture, Player player){
		this.setPlayerName(name);
		this.setPlayerSpeed(2);
		this.textheight = texture.getImageHeight();
		this.textwidth = texture.getImageWidth();
				
		this.player = player;
	}
	
	
	@Override
	public void moveUp() {
		if(0 > this.getPlayerY() - this.textheight + this.getPlayerSpeed()){
			
		}
		else{
			this.setPlayerY(this.getPlayerY() - this.getPlayerSpeed());

		}
	}


	@Override
	public void moveDown() {
		if(Display.getHeight() < this.getPlayerY() + this.textheight + this.getPlayerSpeed()){

		}
		else{
			this.setPlayerY(this.getPlayerY() + this.getPlayerSpeed());

		}
	}


	@Override
	public void moveLeft() {
		if(0 > this.getPlayerX() - this.getPlayerSpeed()){

		}
		else{
			this.setPlayerX(this.getPlayerX() - this.getPlayerSpeed());

		}
	}

	@Override
	public void moveRight() {
		if(Display.getWidth() < this.getPlayerX()+ this.textwidth + this.getPlayerSpeed()){

		}
		else{
			this.setPlayerX(this.getPlayerX() + this.getPlayerSpeed());
		}
	}



	
	@Override
	public void onUpdate() {
		if(LineOfSight.canSee(this, player)){
			if(player.getPlayerX() > this.getPlayerX()){
				moveRight();
			}
			if(player.getPlayerX() < this.getPlayerX()){
				moveLeft();
			}
			if(player.getPlayerY() > this.getPlayerY()){
				moveDown();
			}
			if(player.getPlayerY() < this.getPlayerY()){
				moveUp();
			}
		}
	}

}
