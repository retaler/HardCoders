package com.gmail.grezin.v;

public class Trumpet extends MusicInstrument {

	private String trumpetType;
	private String trumpetMaterial;
	
	public Trumpet(String instrumentName, String instrumentType, String instrumentMark, String trumpetType,
			String trumpetMaterial) {
		super(instrumentName, instrumentType, instrumentMark);
		this.trumpetType = trumpetType;
		this.trumpetMaterial = trumpetMaterial;
	}
	
	public String getTrumpetType() {
		return trumpetType;
	}
	public void setTrumpetType(String trumpetType) {
		this.trumpetType = trumpetType;
	}
	public String getTrumpetMaterial() {
		return trumpetMaterial;
	}
	public void setTrumpetMaterial(String trumpetMaterial) {
		this.trumpetMaterial = trumpetMaterial;
	}
	
	
}
