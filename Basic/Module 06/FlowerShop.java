package com.gmail.grezin.v;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowerShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose redRose = new Rose("Rose", "Red", true);
		Rose whiterose = new Rose("Rose", "White", true);
		Aster asterYellow = new Aster("Aster", "Yellow", "Big");
		Tulip tulip = new Tulip("Tulip", "Pink", "King Size");
		Chamomile chamomile = new Chamomile("Chamomile", "White", "Wild");
		RoseBush roseBush = new RoseBush(3, "Red", 50);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String flowerName = "";
		int modeSwitcher = 0;

		FlowerBouquet bouquet = new FlowerBouquet();
		for (int i = 0; i != 5;) {
			System.out.println("Please enter 1 to add flower, 2 to delete flower! ");
			System.out.println("For exit enter 5 ! ");
			try {
				modeSwitcher = sc1.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("[Error!] You entered not number please choose number 1, 2 or 5 !"+e);
			sc1.nextLine();
			}
			
	
			if (modeSwitcher == 5)
				break;
			
			if (modeSwitcher == 1) {
				System.out.println("Please enter flower name that you want add to bouquet! ");
								
					flowerName = sc2.nextLine();
								
				if (redRose.getFlowerName().equals(flowerName))
					bouquet.add(redRose);
				
				if (whiterose.getFlowerName().toLowerCase().equals(flowerName))
					bouquet.add(whiterose);
				
				if (asterYellow.getFlowerName().toLowerCase().equals(flowerName))
					bouquet.add(asterYellow);
				
				if (tulip.getFlowerName().toLowerCase().equals(flowerName))
					bouquet.add(tulip);
				
				if (chamomile.getFlowerName().toLowerCase().equals(flowerName))
					bouquet.add(chamomile);
				
				bouquet.bouquetInfo();
			}
			
			if (modeSwitcher == 2) {
				if(!bouquet.isFirstElement()){ 
					System.out.println("Your bouqet is empty! Add some flowers");
				}else{
				System.out.println("Please enter flower name that you want add to bouquet! ");
				flowerName = sc2.nextLine();
				
				bouquet.delete(flowerName);
				bouquet.bouquetInfo();
				}
			}
		}
		sc1.close();
		sc2.close();
	}

}
