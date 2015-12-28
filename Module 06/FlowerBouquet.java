package com.gmail.grezin.v;


import java.util.Iterator;
import java.util.LinkedList;

public class FlowerBouquet {
	
	private LinkedList<Flower> bouquet =new LinkedList<>();
		
	public void bouquetInfo(){
		System.out.println("Bouqet consist of:");
		for(Flower fl:bouquet){
			System.out.println(fl.getFlowerName());
		}
	}
	public void add(Flower flower){
		bouquet.add(flower);
	}
	
	public void delete(String flw){
		Iterator<Flower> itr=bouquet.iterator();
		for(;itr.hasNext();){
		if(itr.next().getFlowerName().toLowerCase().equals(flw)){
		itr.remove();
		break;
		}
		}
	}
	public boolean isFirstElement() {
		Iterator<Flower> itr2=bouquet.iterator();
		return itr2.hasNext();
	}

}