/**
 * 
 */
package net.thesahara.game.player;

import java.util.Random;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - Civilian.java
 *@author Greg
 *
 */
public class Civilian extends CivBase{
	public  int textwidth;
	public  int textheight;
	private Random rand = new Random();
	public Civilian(String name, Texture texture){
		this.setPlayerHealth(100);
		this.setPlayerSpeed(10);
		this.setPlayerName(name);
		this.textwidth = texture.getImageWidth();
		this.textheight = texture.getImageHeight();		
		
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
