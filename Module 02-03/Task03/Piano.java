package com.gmail.grezin.v;

public class Piano extends MusicInstrument {

	private String pianoType;
	private String color;
	
	public Piano(String instrumentName, String instrumentType, String instrumentMark, String pianoType, String color) {
		super(instrumentName, instrumentType, instrumentMark);
		this.pianoType = pianoType;
		this.color = color;
	}

	public String getPianoType() {
		return pianoType;
	}

	public void setPianoType(String pianoType) {
		this.pianoType = pianoType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
