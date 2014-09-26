package net.thesahara.engine.util;

public class OSGetter {
	
	public static OSGetter.EnumOS getOSType()
    {
        String s = System.getProperty("os.name").toLowerCase();
        return s.contains("win") ? OSGetter.EnumOS.WINDOWS : (s.contains("mac") ? OSGetter.EnumOS.OSX : (s.contains("solaris") ? OSGetter.EnumOS.SOLARIS : (s.contains("sunos") ? OSGetter.EnumOS.SOLARIS : (s.contains("linux") ? OSGetter.EnumOS.LINUX : (s.contains("unix") ? OSGetter.EnumOS.LINUX : OSGetter.EnumOS.UNKNOWN)))));
    }

   
    public static enum EnumOS
    {
        LINUX,
        SOLARIS,
        WINDOWS,
        OSX,
        UNKNOWN;

        private static final String __OBFID = "CL_00001660";
    }

}
