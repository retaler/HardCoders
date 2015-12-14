package com.gmail.grezin.v;

public class Rose extends Flower {
private boolean wipes;

public Rose(String flowerName, String petalsColor, boolean wipes) {
	super(flowerName, petalsColor);
	this.wipes = wipes;
}

public boolean isWipes() {
	return wipes;
}

public void setWipes(boolean wipes) {
	this.wipes = wipes;
}

}
