/**
 * 
 */
package net.thesahara.game.player;

/**
 *The Sahara - Player.java
 *@author Greg
 *
 */
public class Player extends PlayerBase{
	
	public Player(String name){
		this.setPlayerName(name);
		this.setPlayerHealth(100);
		this.setPlayerSpeed(10);
		
	}

	
	@Override
	public void moveUp() {
		this.setPlayerY(this.getPlayerY() - this.getPlayerSpeed());
	}

	
	@Override
	public void moveDown() {
		this.setPlayerY(this.getPlayerY() + this.getPlayerSpeed());
	}

	
	@Override
	public void moveLeft() {
		this.setPlayerX(this.getPlayerX() - this.getPlayerSpeed());
	}

	@Override
	public void moveRight() {
		this.setPlayerX(this.getPlayerX() + this.getPlayerSpeed());
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
