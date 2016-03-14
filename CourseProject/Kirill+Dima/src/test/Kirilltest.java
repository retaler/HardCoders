package test;

import java.util.Scanner;

public class Kirilltest {
	public static void main(String[] args) {
		// String function="sin(x)";
		// Coordinate of middle segment AB
		double x = 0.0;
		// Coordinate X of start point
		double A = 0.0;
		// Coordinate X of final point
		double B = 0.0;
		// Result function in calculated point
		double F1 = 0.0;
		double F2 = 0.0;
		// Epsilon of function
		double epsilon = 0.005;

		Scanner scaner = new Scanner(System.in);
		System.out.print("Please input left border A:");
		A = scaner.nextDouble();
		System.out.print("Please input right border B:");
		B = scaner.nextDouble();
		double aInput = A;
		double bInput = B;

		// Find of minimal value of function
		while (B - A > epsilon) {
			x = (A + B) / 2;
			F1 = Function(x - epsilon);
			F2 = Function(x + epsilon);
			if (F1 > F2)
				A = x;
			else
				B = x;
		}
		A = aInput;
		B = bInput;
		x = (A + B) / 2;
		System.out.print("Minimum function in point x= " + x);
		System.out.println(".   Minimum of function value = " + Function(x));

		// Find of maximum value of function
		x = 0.0;
		F1 = 0.0;
		F2 = 0.0;
		while (B - A > epsilon) {
			x = (A + B) / 2;
			F1 = Function(x - epsilon);
			F2 = Function(x + epsilon);
			if (F1 < F2)
				A = x;
			else
				B = x;
		}
		x = (A + B) / 2;
		System.out.print("Maximum function in point x= " + x);
		System.out.println(".   Maximum of function value = " + Function(x));

		scaner.close();
	}

	public static double Function(double x) {
		double functionX = Math.pow(x, 2);
		return functionX;
	}

}
