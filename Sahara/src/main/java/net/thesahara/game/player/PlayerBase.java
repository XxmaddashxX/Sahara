/**
 * 
 */
package net.thesahara.game.player;

/**
 *The Sahara - Player.java
 *@author Greg
 *
 */
public abstract class PlayerBase {

	public static int playerX;
	public static int playerY;
	public static int playerHealth;
	public static int playerSpeed;
	public static boolean canMove;
	public static boolean isHurt;
	public static boolean isGodMode;
	public static String race;
	public static String playerName;
	public static int maxHealth;
	public static boolean isDead;
	
	
	public PlayerBase(){

	}
	
	

	public  boolean isDead() {
		return isDead;
	}



	public  void setDead(boolean isDead) {
		PlayerBase.isDead = isDead;
	}



	public  int getMaxHealth() {
		return maxHealth;
	}

	public  void setMaxHealth(int maxHealth) {
		PlayerBase.maxHealth = maxHealth;
	}

	

	public  int getPlayerX() {
		return playerX;
	}

	public  void setPlayerX(int playerX) {
		PlayerBase.playerX = playerX;
	}

	public  int getPlayerY() {
		return playerY;
	}

	public  void setPlayerY(int playerY) {
		PlayerBase.playerY = playerY;
	}

	public  int getPlayerHealth() {
		return playerHealth;
	}

	public  void setPlayerHealth(int playerHealth) {
		PlayerBase.playerHealth = playerHealth;
	}

	public  int getPlayerSpeed() {
		return playerSpeed;
	}

	public void setPlayerSpeed(int playerSpeed) {
		PlayerBase.playerSpeed = playerSpeed;
	}

	public  boolean isCanMove() {
		return canMove;
	}

	public  void setCanMove(boolean canMove) {
		PlayerBase.canMove = canMove;
	}

	public  boolean isHurt() {
		return isHurt;
	}

	public  void setHurt(boolean isHurt) {
		PlayerBase.isHurt = isHurt;
	}

	public  boolean isGodMode() {
		return isGodMode;
	}

	public  void setGodMode(boolean isGodMode) {
		PlayerBase.isGodMode = isGodMode;
	}

	public  String getRace() {
		return race;
	}

	public  void setRace(String race) {
		PlayerBase.race = race;
	}

	public  String getPlayerName() {
		return playerName;
	}

	public  void setPlayerName(String playerName) {
		PlayerBase.playerName = playerName;
	}
	public abstract void moveUp();
	public abstract void moveDown();
	public abstract void moveLeft();
	public abstract void moveRight();
	public abstract void onUpdate();


}
