package net.thesahara.engine.util;

public class AssetLocation {
	private final String domain;
	private final String path;
	public AssetLocation(String string, String string2){
		if (string != null && string2.length() != 0)
        {
            this.domain = string;
        }
        else
        {
            this.domain = "minecraft";
        }

        this.path = string2;
    }
	}

}
