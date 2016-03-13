package goJavaOnline;

/*
 * Task 01: Implement find for minimal and maximal array element.
 */

import java.util.Random;
import java.util.Scanner;

public class MinMaxFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int modeswitcher = -1;
		int minValue;
		int maxValue;
		
		int[] numbersArray = new int[8];
		String manualEnterData = "";
		System.out.println("Please choose how generate array 0- manual mode, 1-automatical");
		modeswitcher = sc.nextInt();
		sc.nextLine();
		if (modeswitcher == 1) {
			numbersArray = generateRandomArray(numbersArray);
		}
		if (modeswitcher == 0) {
			System.out.println("Enter array");
			manualEnterData = sc.nextLine();
			numbersArray = getArray(manualEnterData);
		}
		
		minValue=numbersArray[0];
		maxValue=numbersArray[0];
		for (int j : numbersArray){
			if (j<minValue)minValue=j;
			if(j>maxValue)maxValue=j;
			
		}
			
			System.out.println("minimal value is "+minValue);
			System.out.println("maximal value is "+maxValue);

		sc.close();
	}
	public static int[] generateRandomArray(int[] emptyArray) {
		Random rn = new Random();
		int[] fullArray = new int[emptyArray.length];
		for (int i = 0; i < emptyArray.length; i++) {
			fullArray[i] = rn.nextInt(10);
			System.out.print(fullArray[i] + " ");
		}
		System.out.println();
		return fullArray;
	}

	public static int[] getArray(String manualEnterData) {
		String[] linesArray = { "" };
		int[] generatedArray;
		int position;
		position = manualEnterData.indexOf(" ");
		if (position != -1) {
			linesArray = manualEnterData.split("[ ]");
		}
		position = manualEnterData.indexOf(",");
		if (position != -1) {
			linesArray = manualEnterData.split("[,]");
		}
		position = manualEnterData.indexOf(";");
		if (position != -1) {
			linesArray = manualEnterData.split("[;]");
		}
		generatedArray = new int[linesArray.length];
		for (int i = 0; i < linesArray.length; i++) {
			generatedArray[i] = Integer.parseInt(linesArray[i]);
			System.out.print(generatedArray[i] + " ");
		}
		System.out.println();
		return generatedArray;
	}
	
	
}
