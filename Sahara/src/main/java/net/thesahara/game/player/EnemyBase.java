/**
 * 
 */
package net.thesahara.game.player;

/**
 *The Sahara - EnemyBase.java
 *@author Greg
 *
 */
public abstract class EnemyBase {
	
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
	public static int direction;
	
	public int getDirection() {
		return direction;
	}



	public void setDirection(int direction) {
		EnemyBase.direction = direction;
	}



	public EnemyBase(){

	}
	
	

	public  boolean isDead() {
		return isDead;
	}



	public  void setDead(boolean isDead) {
		EnemyBase.isDead = isDead;
	}



	public  int getMaxHealth() {
		return maxHealth;
	}

	public  void setMaxHealth(int maxHealth) {
		EnemyBase.maxHealth = maxHealth;
	}

	

	public  int getPlayerX() {
		return playerX;
	}

	public  void setPlayerX(int playerX) {
		EnemyBase.playerX = playerX;
	}

	public  int getPlayerY() {
		return playerY;
	}

	public  void setPlayerY(int playerY) {
		EnemyBase.playerY = playerY;
	}

	public  int getPlayerHealth() {
		return playerHealth;
	}

	public  void setPlayerHealth(int playerHealth) {
		EnemyBase.playerHealth = playerHealth;
	}

	public  int getPlayerSpeed() {
		return playerSpeed;
	}

	public void setPlayerSpeed(int playerSpeed) {
		EnemyBase.playerSpeed = playerSpeed;
	}

	public  boolean isCanMove() {
		return canMove;
	}

	public  void setCanMove(boolean canMove) {
		EnemyBase.canMove = canMove;
	}

	public  boolean isHurt() {
		return isHurt;
	}

	public  void setHurt(boolean isHurt) {
		EnemyBase.isHurt = isHurt;
	}

	public  boolean isGodMode() {
		return isGodMode;
	}

	public  void setGodMode(boolean isGodMode) {
		EnemyBase.isGodMode = isGodMode;
	}

	public  String getRace() {
		return race;
	}

	public  void setRace(String race) {
		EnemyBase.race = race;
	}

	public  String getPlayerName() {
		return playerName;
	}

	public  void setPlayerName(String playerName) {
		EnemyBase.playerName = playerName;
	}
	public abstract void moveUp();
	public abstract void moveDown();
	public abstract void moveLeft();
	public abstract void moveRight();
	public abstract void onUpdate();



}
