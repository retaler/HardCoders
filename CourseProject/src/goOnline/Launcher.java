package goOnline;

import java.util.Stack;

public class Launcher {

	public static void main(String[] args) throws ParseException {

		UI userInput = new UI();
		Stack<String> functionInRPN = null;

		String unrecognisedFunction = userInput.functionRequester();
		Parser parser = new Parser();
		functionInRPN = parser.parse(unrecognisedFunction);

		double[] boarders = new double[2];
		boarders = userInput.determinationField();
		double leftBorder = boarders[0];
		double rightBorder = boarders[1];
		ExtremumFinder finder = new ExtremumFinder();

		String extremumAvailability = finder.extremumCheck(functionInRPN, leftBorder, rightBorder);

		if (extremumAvailability.equals("min")) {
			System.out.printf("Minimum point is: %.3f \n",
					finder.minFinder(functionInRPN, leftBorder, rightBorder, 0.001));
			System.out.printf("Maximum point is: %.3f \n",
					finder.maxFinder(functionInRPN, leftBorder, rightBorder, 0.001));
		}
		if (extremumAvailability.equals("max")) {
			System.out.printf("Minimum point is: %.3f \n",
					finder.minFinder(functionInRPN, leftBorder, rightBorder, 0.001));
			System.out.printf("Maximum point is: %.3f \n",
					finder.maxFinder(functionInRPN, leftBorder, rightBorder, 0.001));
		}
		if (extremumAvailability.equals("both")) {
			System.out.printf("Minimum point is: %.3f \n",
					finder.minFinder(functionInRPN, leftBorder, rightBorder, 0.001));
			System.out.printf("Maximum point is: %.3f \n",
					finder.maxFinder(functionInRPN, leftBorder, rightBorder, 0.001));
		}
		if (extremumAvailability.equals("non"))
			System.out.println("This function doesn't have minimum or maximum!");

	}

}
