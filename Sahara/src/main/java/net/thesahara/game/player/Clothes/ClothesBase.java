/**
 * 
 */
package net.thesahara.game.player.Clothes;

import org.newdawn.slick.opengl.Texture;

/**
 *The Sahara - ClothesBase.java
 *@author Greg
 *
 */
public abstract class ClothesBase {
	
	public String name;
	public Texture texture;
	
	public ClothesBase(String name, Texture texture){
		this.name = name;
		this.texture = texture;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  Texture getTexture() {
		return texture;
	}

	public  void setTexture(Texture texture) {
		this.texture = texture;
	}
	
	public abstract void onEquipped();
	

}
