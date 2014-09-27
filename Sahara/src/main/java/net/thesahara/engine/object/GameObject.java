package net.thesahara.engine.object;

import net.thesahara.engine.render.Animation;

public abstract class GameObject {
	private float x;
	private float y;
	private Animation anim;
	

	public void update(){
		
	}
	public void render(){
		
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return y;	
	}

}
