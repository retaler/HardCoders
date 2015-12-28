package com.gmail.grezin.v;

public class RoseBush {
private int roseQuantity;
private String color;
private int roseLength;
public RoseBush(int roseQuantity, String color, int roseLength) {
	super();
	this.roseQuantity = roseQuantity;
	this.color = color;
	this.roseLength = roseLength;
}
public int getRoseQuantity() {
	return roseQuantity;
}
public void setRoseQuantity(int roseQuantity) {
	this.roseQuantity = roseQuantity;
}
public String getColor() {
	return color;
}

public int getRoseLength() {
	return roseLength;
}
public void setRoseLength(int roseLength) {
	this.roseLength = roseLength;
}
public void cutRose(int quantity){
	this.roseQuantity=this.roseQuantity-quantity;
}

}
