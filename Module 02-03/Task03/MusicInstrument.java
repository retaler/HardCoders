package com.gmail.grezin.v;

public class MusicInstrument {
private String instrumentName;
private String instrumentType;
private String instrumentMark;
private double price;
public MusicInstrument(String instrumentName, String instrumentType, String instrumentMark) {
	super();
	this.instrumentName = instrumentName;
	this.instrumentType = instrumentType;
	this.instrumentMark = instrumentMark;
}
public String getInstrumentName() {
	return instrumentName;
}
public void setInstrumentName(String instrumentName) {
	this.instrumentName = instrumentName;
}
public String getInstrumentType() {
	return instrumentType;
}
public void setInstrumentType(String instrumentType) {
	this.instrumentType = instrumentType;
}
public String getInstrumentMark() {
	return instrumentMark;
}
public void setInstrumentMark(String instrumentMark) {
	this.instrumentMark = instrumentMark;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
