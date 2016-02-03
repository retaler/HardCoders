package goOnlineTest;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;
import org.junit.runner.notification.Failure;

import goOnline.ExtremumFinder;
import goOnline.ParseException;
import goOnline.Parser;

public class ParserTest {

	Parser testParser = new Parser();
	String sourceFunction = "x^2+(sin(x)-125.0*(x+3)^2/x)";
	String actualSteckResult = "";
	Stack<String> actualSteck;
	ExtremumFinder rounder = new ExtremumFinder();

	@Test
	public void parseTest() {
		String expectedResult = "x2^xsin125.0x3+*2^x/-+";

		try {
			actualSteck = testParser.parse(sourceFunction);
		} catch (ParseException e) {
					e.printStackTrace();
		}
		while (!actualSteck.empty()) {
			actualSteckResult+=actualSteck.pop();
		}
		
		
		assertTrue(expectedResult.compareTo(actualSteckResult)==0);

	}

	@Test
	public void recognisedFunctionTest() throws ParseException {
		String simpleFunction = "cos(x)";
		Double x = Math.PI/2;
		Double result;
		actualSteck=testParser.parse(simpleFunction);
		result = rounder.round(testParser.recognizedFunction(actualSteck, x), 2);
		assertTrue(result == 0.0);
	}

}
