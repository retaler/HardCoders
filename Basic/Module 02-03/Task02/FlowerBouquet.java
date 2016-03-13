package com.gmail.grezin.v;

import java.util.ArrayList;

public class FlowerBouquet {
	
	ArrayList<String> bouquet =new ArrayList<>();
		
	public void bouquetInfo(){
		System.out.println("Bouqet consist of:");
		for(Object fl:bouquet){
			System.out.println(fl);
		}
	}
	public void add(String flowerName){
		bouquet.add(flowerName);
	}
	
	public void delete(String flw){
		bouquet.remove(bouquet.indexOf(flw));
	}

}