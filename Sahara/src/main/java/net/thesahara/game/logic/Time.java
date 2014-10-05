/**
 * 
 */
package net.thesahara.game.logic;

import java.util.concurrent.TimeUnit;

/**
 *The Sahara - Time.java
 *@author Greg
 *
 */
public class Time implements Runnable{
	
	
	private static boolean isRunning;
	
	@Override
	public void run() {
		isRunning = true;
		while(isRunning){
			if(!isRunning){
				break;
			}
			TimeHandler.increaseTime();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}


	


	

}
