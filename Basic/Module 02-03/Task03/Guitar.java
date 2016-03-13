package com.gmail.grezin.v;

public class Guitar extends MusicInstrument{

	private int stringNumber;
	private String guitarType;
	
	public Guitar(String instrumentName, String instrumentType, String instrumentMark, int stringNumber,
			String guitarType) {
		super(instrumentName, instrumentType, instrumentMark);
		this.stringNumber = stringNumber;
		this.guitarType = guitarType;
	}

	public int getStringNumber() {
		return stringNumber;
	}

	public void setStringNumber(int stringNumber) {
		this.stringNumber = stringNumber;
	}

	public String getGuitarType() {
		return guitarType;
	}

	public void setGuitarType(String guitarType) {
		this.guitarType = guitarType;
	}
	
	
}
