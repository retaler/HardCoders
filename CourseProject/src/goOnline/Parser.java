package goOnline;

import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class Parser {

	// list of available functions
	private final String[] FUNCTIONS = { "arccos", "arcsin", "arctg", "arcctg", "cos", "sin", "tg", "ctg", "sqrt", "exp" };
	// list of available operators
	private final String OPERATORS = "+-*/^";
	// separator of arguments
	private final String SEPARATOR = ",";
	// variable token
	private final String VARIABLE = "x";
	// temporary stack that holds operators, functions and brackets
	private Stack<String> stackOperations = new Stack<String>();
	// stack for holding expression converted to reversed polish notation
	private Stack<String> stackRPN = new Stack<String>();
	

	private boolean isNumber(String token) {
		try {
			Double.parseDouble(token);
		} catch (Exception e) {
			if (token.equals(VARIABLE)) {
				return true;
			}
			return false;
		}
		return true;
	}

	private boolean isFunction(String token) {
		for (String item : FUNCTIONS) {
			if (item.equals(token)) {
				return true;
			}
		}
		return false;
	}

	private boolean isSeparator(String token) {
		return token.equals(SEPARATOR);
	}

	private boolean isOpenBracket(String token) {
		return token.equals("(");
	}

	private boolean isCloseBracket(String token) {
		return token.equals(")");
	}

	private boolean isOperator(String token) {
		return OPERATORS.contains(token);
	}

	private byte getPrecedence(String token) {
		if (token.equals("+") || token.equals("-")) {
			return 1;
		}
		return 2;
	}

	public Stack<String> parse(String sourceString) throws ParseException {
		// cleaning stacks
		stackOperations.clear();
		stackRPN.clear();

		// delete from our string spaces and rebuilt negative sign of first
		// element
		sourceString = sourceString.replace(" ", "").replace("(-", "(0-");
		if (sourceString.charAt(0) == '-') {
			sourceString = "0" + sourceString;
		}
		// splitting input string into tokens
		StringTokenizer stringTokenizer = new StringTokenizer(sourceString, OPERATORS + SEPARATOR + "()", true);

		// loop for handling each token - shutting-yard algorithm
		while (stringTokenizer.hasMoreTokens()) {
			String token = stringTokenizer.nextToken();
			if (isSeparator(token)) {
				while (!stackOperations.empty() && !isOpenBracket(stackOperations.lastElement())) {
					stackRPN.push(stackOperations.pop());
				}
			} else if (isOpenBracket(token)) {
				stackOperations.push(token);
			} else if (isCloseBracket(token)) {
				while (!stackOperations.empty() && !isOpenBracket(stackOperations.lastElement())) {
					stackRPN.push(stackOperations.pop());
				}
				stackOperations.pop();
				if (!stackOperations.empty() && isFunction(stackOperations.lastElement())) {
					stackRPN.push(stackOperations.pop());
				}
			} else if (isNumber(token)) {
				if (token.equals(VARIABLE)) {
					stackRPN.push(VARIABLE);
				} else {
					stackRPN.push(token);
				}
			} else if (isOperator(token)) {
				while (!stackOperations.empty() && isOperator(stackOperations.lastElement())
						&& getPrecedence(token) <= getPrecedence(stackOperations.lastElement())) {
					stackRPN.push(stackOperations.pop());
				}
				stackOperations.push(token);
			} else if (isFunction(token)) {
				stackOperations.push(token);
			}
		}
		while (!stackOperations.empty()) {
			stackRPN.push(stackOperations.pop());

		}

		// reverse stack
		Collections.reverse(stackRPN);
		return stackRPN;

	}

	public double recognizedFunction(Stack<String> myFunction, double x) {
		stackRPN= extracted(myFunction);	
		Stack<Double> stackAnswer = new Stack<>();
		
		while (!stackRPN.empty()) {
			String token = stackRPN.pop();

			if (isNumber(token)) {
				if (token.equals(VARIABLE)) {
					stackAnswer.push(x);
				} else {
					try {
						stackAnswer.push(Double.parseDouble(token));
					} catch (Exception e) {
						System.out.println("ParseDouble Exception: " + e);
					}
				}
			}else if (!stackAnswer.empty() && isOperator(token)) {
				stackAnswer.push(applyOperator(stackAnswer.pop(), stackAnswer.pop(),token));
			}else if (!stackAnswer.empty() && isFunction(token)) {
				stackAnswer.push(applyFunction(stackAnswer.pop(),token));

			}
		}
		double answer = stackAnswer.pop();
		if (stackAnswer.empty()) {
			return answer;
		} else
			return 11267532946.4616198;
	}

	private Stack<String> extracted(Stack<String> myFunction) {
		return (Stack<String>) myFunction.clone();
	}

	private Double applyOperator(Double firstValue,Double secondValue,String operator) {
		if (operator.equals("+")) {
			return firstValue+secondValue;
		}
		if (operator.equals("-")) {
			return firstValue-secondValue;
		}
		if (operator.equals("*")) {
			return firstValue*secondValue;
		}
		if (operator.equals("/")) {
			return firstValue/secondValue;
		}
		if (operator.equals("^")) {
			
		return Math.pow(secondValue, firstValue);
		}
		return 0.0;
		}

	private Double applyFunction(Double variable, String functionName) {
		if (functionName.equals("arccos")) {
			return Math.acos(variable);
		}
		if (functionName.equals("arcsin")) {
			return Math.asin(variable);
		}
		if (functionName.equals("arctg")) {
			return Math.atan(variable);
		}
		if (functionName.equals("arcctg")) {
			return Math.PI/2-Math.atan(variable);
		}
		if (functionName.equals("cos")) {
			return Math.cos(variable);
		}
		if (functionName.equals("sin")) {
			return Math.sin(variable);
		}
		if (functionName.equals("tg")) {
			return Math.tan(variable);
		}
		if (functionName.equals("ctg")) {
			
			return Math.cos(variable)/Math.sin(variable);
		}
		if (functionName.equals("sqrt")) {
			return Math.sqrt(variable);
		}
		if (functionName.equals("exp")) {
			return Math.exp(variable);
		}
		return 0.0;
	}

	
	


}
