package goOnline;

import java.util.Stack;

//RunWith(value=Parametrised.class)
public class ExtremumFinder {
	Parser function = new Parser();

	public double minFinder(Stack<String> functionRPN, double a, double b, final double accuracy) {
		double min = -100;
		double leftPart;
		double rightPart;
		double middle;
		for (; Math.abs(b - a) > accuracy;) {
			middle = (a + b) / 2;
			leftPart = function.recognizedFunction(functionRPN, middle - accuracy);
			rightPart = function.recognizedFunction(functionRPN, middle + accuracy);
			if (leftPart < rightPart) {
				b = middle;
			} else {
				a = middle;
			}
			if (Math.abs(b - a) < accuracy) {
				min = (double) (b + a) / 2;

			}

		}

		return round(min, 2);
	}

	public double maxFinder(Stack<String> functionRPN, double leftBorder, double rightBorder, final double accuracy) {
		double max = -100;
		double leftPart;
		double rightPart;
		double middle;
		for (; Math.abs(rightBorder - leftBorder) > accuracy;) {
			middle = (leftBorder + rightBorder) / 2;
			leftPart = function.recognizedFunction(functionRPN, middle - accuracy);
			rightPart = function.recognizedFunction(functionRPN, middle + accuracy);
			if (leftPart < rightPart) {
				leftBorder = middle;
			} else {
				rightBorder = middle;
			}
			if (Math.abs(rightBorder - leftBorder) < accuracy) {
				max = (double) (rightBorder + leftBorder) / 2;

			}

		}
		return round(max, 2);

	}

	public String extremumCheck(Stack<String> functionRPN, final double a, final double b) {
		double firstValue;
		double secondValue;
		final int POINTS = 10;
		final double step = Math.abs(b - a) / POINTS;
		int direction = 0;
		int extremum = 0;
		int compare;
		for (double i = a; i < b; i += step) {
			if (i == a) {
				firstValue = function.recognizedFunction(functionRPN, i);
				secondValue = function.recognizedFunction(functionRPN, i + step);

				if (Double.compare(firstValue, secondValue) > 0)
					direction = -1;
				if (Double.compare(firstValue, secondValue) < 0)
					direction = 1;
			}
			firstValue = function.recognizedFunction(functionRPN, i);
			secondValue = function.recognizedFunction(functionRPN, i + step);
			compare = Double.compare(firstValue, secondValue);
			if ((Double.isInfinite(firstValue)) || (Double.isInfinite(secondValue)))
				continue;
			if ((direction == -1) && (compare < 0)) {
				extremum++;
				direction = 1;
			}
			if ((direction == 1) && (compare > 0)) {
				direction = -1;
				extremum++;
			}
			if (((direction == -1) || (direction == 1)) && (compare == 0))
				direction = 0;

		}
		if ((direction == 1) && (extremum == 1))
			return "min";
		if ((direction == -1) && (extremum == 1))
			return "max";
		if (extremum > 1)
			return "both";

		return "non";

	}

	public double round(final double number, final int scale) {
		final int pow = (int) Math.pow(10, scale);
		final double temporaryValue = number * pow;
		return (double) (int) ((temporaryValue - (int) temporaryValue) >= 0.5f ? temporaryValue + 1 : temporaryValue)
				/ pow;
	}

}
