package com.gmail.grezin.v;

public class Chamomile extends Flower{

	private String growingPlace; // wild or hothouse

	public Chamomile(String flowerName, String petalsColor, String growingPlace) {
		super(flowerName, petalsColor);
		this.growingPlace = growingPlace;
	}

	public String getGrowingPlace() {
		return growingPlace;
	}

	public void setGrowingPlace(String growingPlace) {
		this.growingPlace = growingPlace;
	}
	
	
}
