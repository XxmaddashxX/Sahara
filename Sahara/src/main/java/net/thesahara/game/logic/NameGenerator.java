/**
 * 
 */
package net.thesahara.game.logic;

import java.util.ArrayList;
import java.util.Random;

/**
 *The Sahara - NameGenerator.java
 *@author Greg
 *
 */
public class NameGenerator {
	private static Random rand = new Random();
	private static ArrayList<String> balkooseFirst = new ArrayList<String>();
	private static ArrayList<String> balkooseLast = new ArrayList<String>();
	public NameGenerator(){
		
	}
	public static String getName(String race){
		addNames();
		String string1;
		String string2;
		if(race == "Balkoose"){
			string1 = balkooseFirst.get(rand.nextInt(balkooseFirst.size()));
			string2 = balkooseLast.get(rand.nextInt(balkooseLast.size()));
			return string1 + " " + string2;
		}
		return null;
	}
	private static void addNames(){
		balkooseFirst.add("Bill");balkooseFirst.add("Bob");
		balkooseLast.add("Lop");balkooseLast.add("Lop");
	
	}
	
}
