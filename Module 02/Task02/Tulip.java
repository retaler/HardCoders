package com.gmail.grezin.v;

public class Tulip {
private String color;
private String sortName;
private String flowerName;

public Tulip(String color, String sortName, String flowerName) {
	super();
	this.color = color;
	this.sortName = sortName;
	this.flowerName = flowerName;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getSortName() {
	return sortName;
}

public void setSortName(String sortName) {
	this.sortName = sortName;
}

public String getFlowerName() {
	return flowerName;
}

public void setFlowerName(String flowerName) {
	this.flowerName = flowerName;
}


}
