/**
 * 
 */
package net.thesahara.game.player;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - Player.java
 *@author Greg
 *
 */
public class Player extends PlayerBase{
	public int textwidth;
	public int textheight;
	public Player(String name, Texture texture){
		this.setPlayerName(name);
		this.setPlayerHealth(100);
		this.setPlayerSpeed(10);
		this.textheight = texture.getImageHeight();
		this.textwidth = texture.getImageWidth();

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
		if(this.getPlayerHealth() < this.getMaxHealth() / 2){
			this.setHurt(true);
			this.setPlayerSpeed(this.getPlayerSpeed()/ 2);
		}
		if(this.getPlayerHealth() <= 0){
			this.setDead(true);
			this.setCanMove(false);
		}

	}

}
