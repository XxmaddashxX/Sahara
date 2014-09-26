package net.thesahara.game.items;

public class ItemBase {
	
	
	public static String unlocalizedName;
	public static int damage;
	public static boolean isThrown;
	public static boolean isPlaceable;
	public static int weight;
	public static int slot;
	public static boolean isTinkerable;
	public static int stacksize;
	public static boolean isStoreableInv;
	public static boolean isStoreableCon;
	public static boolean isLootable;
	public static String getUnlocalizedName() {
		return unlocalizedName;
	}
	public static void setUnlocalizedName(String unlocalizedName) {
		ItemBase.unlocalizedName = unlocalizedName;
	}
	public static int getDamage() {
		return damage;
	}
	public static void setDamage(int damage) {
		ItemBase.damage = damage;
	}
	public static boolean isThrown() {
		return isThrown;
	}
	public static void setThrown(boolean isThrown) {
		ItemBase.isThrown = isThrown;
	}
	public static boolean isPlaceable() {
		return isPlaceable;
	}
	public static void setPlaceable(boolean isPlaceable) {
		ItemBase.isPlaceable = isPlaceable;
	}
	public static int getWeight() {
		return weight;
	}
	public static void setWeight(int weight) {
		ItemBase.weight = weight;
	}
	public static int getSlot() {
		return slot;
	}
	public static void setSlot(int slot) {
		ItemBase.slot = slot;
	}
	public static boolean isTinkerable() {
		return isTinkerable;
	}
	public static void setTinkerable(boolean isTinkerable) {
		ItemBase.isTinkerable = isTinkerable;
	}
	public static int getStacksize() {
		return stacksize;
	}
	public static void setStacksize(int stacksize) {
		ItemBase.stacksize = stacksize;
	}
	public static boolean isStoreableInv() {
		return isStoreableInv;
	}
	public static void setStoreableInv(boolean isStoreableInv) {
		ItemBase.isStoreableInv = isStoreableInv;
	}
	public static boolean isStoreableCon() {
		return isStoreableCon;
	}
	public static void setStoreableCon(boolean isStoreableCon) {
		ItemBase.isStoreableCon = isStoreableCon;
	}
	

}
