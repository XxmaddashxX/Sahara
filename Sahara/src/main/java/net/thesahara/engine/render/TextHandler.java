/**
 * 
 */
package net.thesahara.engine.render;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;



/**
 *The Sahara - TextHandler.java
 *@author Greg
 *
 */
public class TextHandler {
	private static TrueTypeFont font;
	public static String TIMESNEWROMAN = "Times New Roman";
	public static TrueTypeFont loadFont(String fontType, int size){
		
		Font awtFont = new Font(fontType, Font.BOLD, size);
		font = new TrueTypeFont(awtFont, false);
		return font;
	}
	public static void drawString(TrueTypeFont font, int x, int y, String text,  Color color){
		font.drawString(x, y, text, color);
	}
	
	
	

}