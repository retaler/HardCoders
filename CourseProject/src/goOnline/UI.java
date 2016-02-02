package goOnline;

import java.util.Scanner;

public class UI {
	
	public String functionRequester(){
		String function="";
		Scanner scanF=new Scanner(System.in);
		System.out.println("Please enter function in next style: \n"
				+ "1) 10*x*exp(2*x) or \n"
				+ "2)  x*exp(-x)+cos(3*x) or \n"
				+ "3) x^3-x^2+3");
		function=scanF.nextLine();
		
		
		return function;
	}
	
	public double[] determinationField(){
		double[] determination=new double[2];
		Scanner scanD=new Scanner(System.in);
		for(int i=0; i<determination.length;i++){
			System.out.printf("Please enter %d boarder value:", i+1);
			determination[i]=scanD.nextDouble();
		}
		
		scanD.close();
			
		return determination;
	}
	

}
