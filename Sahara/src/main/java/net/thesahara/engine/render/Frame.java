package net.thesahara.engine.render;

public class Frame {
	
	private int length;
	private Sprite sprite;
	private int displayed;
	
	public Frame(Sprite spr, int length){
		this.sprite = spr;
		this.length = length;
		this.displayed = 0;
	}
	
	public boolean render(){
		sprite.render();
		this.displayed ++;
		if(this.displayed >= this.length){
			this.displayed = 0;
			return true;
		}
		return false;
		
	}

}
