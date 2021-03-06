/**
 * 
 */
package net.thesahara.engine.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.thesahara.game.SaharaProps;
/**
 *The Sahara - ILog.java
 *@author Greg
 *
 */
public class IConsole {
	
	public static final String gameload = "LOAD";
	public static final String gameconfig = "CONFIG"; 
	public static final String gametexture = "TEXTURE";
	public static final String gameerror = "ERROR";
	public static final String gameunknown = "UNKNOWN";
	public static final String gamedebug = "DEBUG";
	public static final String gameplayer = "PLAYER";
	public static final String gameevent = "EVENT";
	public static final String gamegui = "GUI";
	public static final String gameexception = "EXECPTION";
	public static final String gamemissing = "MISSING";
	public static final String gameend = "END";
	public static final String gamepause = "PAUSE";
	public static final String gameskip = "SKIP";
	public static final String gameupdate = "UPDATE";
	public static final String gameinfo = "INFO";
	public static final String gamemodel = "MODEL";
	public static final String gameicon = "ICON";
	public static final String gameclient = "CLIENT";
	public static final String gameserver = "SERVER";
	public static final String gameaddon = "ADDON";
	public static final String gameelement = "ELEMENT";
	public static final String gamewarning = "WARNING";
	public static final String gameregister = "REGISTERATION";
	
		
	public static void print(String title, String text){
		DateFormat dateformat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		System.out.println("[" + dateformat.format(date) + "] [" + title.toUpperCase() + "] " + text);
	
	}
	public static void printStartDetails(){
		
		System.out.println("----The Sahara----");
		System.out.println("Version: " + SaharaProps.VERSION);
		System.out.println("Using Java 1.7 and lwjgl 2.9.1");
		System.out.println("Coded by " + SaharaProps.AUTHOR_CODE);
		System.out.println("Textures and Management by " + SaharaProps.AUTHOR_TEXTURE);
		System.out.println("Sounds by " + SaharaProps.AUTHOR_SOUND);
		System.out.println("Thanks for playing!");
	
	}

}
