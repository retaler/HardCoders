package com.gmail.grezin.v;

public class Tulip extends Flower{
private String sortName;



public Tulip(String flowerName, String petalsColor, String sortName) {
	super(flowerName, petalsColor);
	this.sortName = sortName;
}


public String getSortName() {
	return sortName;
}

public void setSortName(String sortName) {
	this.sortName = sortName;
}


}
