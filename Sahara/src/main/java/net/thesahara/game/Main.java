package net.thesahara.game;

import org.lwjgl.LWJGLException;

import net.thesahara.engine.Sahara;

public class Main{
	
	public static Sahara sahara;
	
	public Main(){
		
		
		
	}
	public static void main(String[] args) throws LWJGLException{
	
		
		Sahara sahara = new Sahara();
		sahara.start();
		
		
	}
	
	
	

}
