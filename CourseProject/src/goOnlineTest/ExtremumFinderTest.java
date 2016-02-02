package goOnlineTest;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;
import goOnline.ExtremumFinder;
import goOnline.ParseException;
import goOnline.Parser;

public class ExtremumFinderTest {

	Double accuracy = 0.01;
	Double leftBorder = -4.0;
	Double rightBorder = 4.0;

	@Test
	public void roundTest() {
		ExtremumFinder finder = new ExtremumFinder();
		assertTrue(Double.compare(1.57, finder.round(Math.PI / 2, 2)) == 0);
	}

	@Test
	public void minFinderTest() throws ParseException {
		String unrecognizedFunction = "sin(x)";
		Parser functionSource = new Parser();
		ExtremumFinder finder = new ExtremumFinder();
		Stack<String> parcedFunction = functionSource.parse(unrecognizedFunction);

		double actual = finder.minFinder(parcedFunction, leftBorder, rightBorder, accuracy);
		double expected = -1.57;

		assertTrue(Double.compare(actual, expected) == 0);
	}
	
	@Test
	public void maxFinderTest() throws ParseException {
		String unrecognizedFunction = "sin(x)";
		Parser functionSource = new Parser();
		ExtremumFinder finder = new ExtremumFinder();
		Stack<String> parcedFunction = functionSource.parse(unrecognizedFunction);

		double actual = finder.maxFinder(parcedFunction, leftBorder, rightBorder, accuracy);
		double expected = 1.57;

		assertTrue(Double.compare(actual, expected) == 0);
	}
	
	@Test 
	public void extremumCheckTest() throws ParseException {
		String unrecognizedFunction = "x^2";
		Parser functionSource = new Parser();
		ExtremumFinder finder = new ExtremumFinder();
		Stack<String> parcedFunction = functionSource.parse(unrecognizedFunction);

		String actual = finder.extremumCheck(parcedFunction, leftBorder, rightBorder);
		String expected = "min";

		assertTrue(actual.equals(expected));
	}

}
