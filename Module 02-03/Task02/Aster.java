package com.gmail.grezin.v;

public class Aster extends Flower {
private String size;

public Aster(String flowerName, String petalsColor, String size) {
	super(flowerName, petalsColor);
	this.size = size;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}


}
