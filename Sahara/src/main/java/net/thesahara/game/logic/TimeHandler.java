/**
 * 
 */
package net.thesahara.game.logic;

/**
 *The Sahara - TimeHandler.java
 *@author Greg
 *
 */

public class TimeHandler {
	public static int time;
	public static int hour;
	public static String timecode;
	public static String dis;
	public static void increaseTime(){
		TimeHandler.time = TimeHandler.time + 1;
		if(TimeHandler.time >= 60){
			TimeHandler.time = 00;
			TimeHandler.hour = TimeHandler.hour + 1;
			if(TimeHandler.time < 10){
				TimeHandler.dis = "0";
			}
			if(TimeHandler.time > 9){
				TimeHandler.dis = " ";
			}
			if(TimeHandler.hour == 12){
				TimeHandler.timecode = "PM";
				return;
			}
			if(TimeHandler.hour == 24){
				TimeHandler.hour = 0;
				TimeHandler.timecode = "AM";
				return;
			}
			
		}
		return;
	}
	public static void setTime(int amt){
		
	}
	public static String getTimeCode(){
		if(TimeHandler.timecode == null){
			return "AM";
		}
		return TimeHandler.timecode;
	}
	public static String getDis(){
		if(TimeHandler.time > 9){
			return "";
		}
		else{
			return "0";
		}
	}
	
	
	
}
