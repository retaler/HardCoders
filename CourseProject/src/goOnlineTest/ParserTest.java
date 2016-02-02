package goOnlineTest;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import goOnline.ParseException;
import goOnline.Parser;

public class ParserTest {

	Parser testParser = new Parser();
	String sourceFunction = "x^2+(sin(x)-125.0*(x+3)^2/x)";
	String actualSteckResult = "";
	Stack<String> actualSteck;

	@Test(expected = ParseException.class)
	public void parseTest() throws ParseException {
		String result = "x2^xsin125.0x3+*2^x/-+";

		actualSteck = testParser.parse(sourceFunction);
		while (!actualSteck.empty()) {
			actualSteckResult+=actualSteck.pop();
		}
		//actualSteckResult.replaceAll(",", "");
		System.out.print(actualSteckResult+"\n");
		System.out.print(result);
		
		assertTrue(result.compareTo(actualSteckResult)==0);

	}

	@Test
	public void recognisedFunctionTest() throws ParseException {
		String simpleFunction = "x^2";
		Double x = 0.0;
		Double result;
		actualSteck=testParser.parse(simpleFunction);
		result = testParser.recognizedFunction(actualSteck, x);
		assertTrue(result == 0.0);
	}

}
