package com.gmail.grezin.v;

public class FlowerShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose redRose=new Rose("Rose", "Red", true);
		Rose whiterose=new Rose("Rose", "White", true);
		Aster asterYellow=new Aster("Aster","Yellow" , "Big");
		Tulip tulip=new Tulip("White", "Swan", "Tulip");
		Chamomile chamomile=new Chamomile("Chamomile", "White", "Wild");
		
		FlowerBouquet bouquet=new FlowerBouquet();
		bouquet.add(redRose.getFlowerName());
		bouquet.add(whiterose.getFlowerName());
		bouquet.add(asterYellow.getFlowerName());
		bouquet.add(tulip.getFlowerName());
		bouquet.add(chamomile.getFlowerName());
		
		bouquet.bouquetInfo();
		}

}
