/**
 * 
 */
package net.thesahara.game.player;

import java.util.Random;

/**
 *The Sahara - Civilian.java
 *@author Greg
 *
 */
public class Civilian extends CivBase{
	
	private Random rand = new Random();
	public Civilian(String name){
		this.setPlayerHealth(100);
		this.setPlayerSpeed(10);
		this.setPlayerName(name);
		
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
		int num = rand.nextInt(80);
		if(num == 1){
			this.moveUp();
		}
		if(num == 3){
			this.moveDown();
		}
		if(num == 5){
			this.moveLeft();
		}
		if(num == 7){
			this.moveRight();
		}
		
	}

}