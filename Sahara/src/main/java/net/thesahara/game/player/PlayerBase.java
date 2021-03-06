/**
 * 
 */
package net.thesahara.game.player;

import net.thesahara.game.player.Clothes.ClothesBase;

/**
 *The Sahara - Player.java
 *@author Greg
 *
 */
public abstract class PlayerBase {

	public  int playerX;
	public  int playerY;
	public  int playerHealth;
	public  int playerSpeed;
	public  boolean canMove;
	public  boolean isHurt;
	public  boolean isGodMode;
	public  String race;
	public  String playerName;
	public  int maxHealth;
	public  boolean isDead;
	public  int direction;
	public ClothesBase clothesbottom;
	public ClothesBase clothestop;
	
	public int getDirection() {
		return direction;
	}



	public void setDirection(int direction) {
		this.direction = direction;
	}



	public PlayerBase(){

	}
	
	

	public  boolean isDead() {
		return isDead;
	}



	public  void setDead(boolean isDead) {
		this.isDead = isDead;
	}



	public  int getMaxHealth() {
		return maxHealth;
	}

	public  void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	

	public  int getPlayerX() {
		return playerX;
	}

	public  void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public  int getPlayerY() {
		return playerY;
	}

	public  void setPlayerY(int playerY) {
		this.playerY = playerY;
	}

	public  int getPlayerHealth() {
		return playerHealth;
	}

	public  void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}

	public  int getPlayerSpeed() {
		return playerSpeed;
	}

	public void setPlayerSpeed(int playerSpeed) {
		this.playerSpeed = playerSpeed;
	}

	public  boolean isCanMove() {
		return canMove;
	}

	public  void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}

	public  boolean isHurt() {
		return isHurt;
	}

	public  void setHurt(boolean isHurt) {
		this.isHurt = isHurt;
	}

	public  boolean isGodMode() {
		return isGodMode;
	}

	public  void setGodMode(boolean isGodMode) {
		this.isGodMode = isGodMode;
	}

	public  String getRace() {
		return race;
	}

	public  void setRace(String race) {
		this.race = race;
	}

	public  String getPlayerName() {
		return playerName;
	}

	public  void setPlayerName(String playerName) {
	}
	


	public ClothesBase getClothesbottom() {
		return clothesbottom;
	}



	public void setClothesbottom(ClothesBase clothesbottom) {
		this.clothesbottom = clothesbottom;
	}



	public ClothesBase getClothestop() {
		return clothestop;
	}



	public void setClothestop(ClothesBase clothestop) {
		this.clothestop = clothestop;
	}



	public abstract void moveUp();
	public abstract void moveDown();
	public abstract void moveLeft();
	public abstract void moveRight();
	public abstract void onUpdate();


}
