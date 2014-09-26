package net.thesahara.engine;

import java.io.InputStream;

import net.thesahara.engine.util.OSGetter;
import net.thesahara.game.SaharaProps;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Sahara {

	public static void start() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.setResizable(true);
			
			Display.setTitle("Sahara " + SaharaProps.VERSION);
			OSGetter.EnumOS enumos = OSGetter.getOSType();

			if (enumos != OSGetter.EnumOS.OSX){
				//InputStream inputstream = 
			}
				Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}



		while (!Display.isCloseRequested()) {



			Display.update();
		}

		Display.destroy();
	}

}
