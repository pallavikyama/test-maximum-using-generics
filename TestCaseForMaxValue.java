package com.blz.testmaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseForMaxValue {

	// TEST CASES - 1.1, 1.2, 1.3
	@Test
	public void testMaxInt() {
		Integer expected = 3;
		Integer actual1 = MaxOfThreeValues.findMax(3, 2, 1); // MAX INTEGER AT POSITION-1
		assertEquals(expected, actual1);
		Integer actual2 = MaxOfThreeValues.findMax(2, 3, 1); // MAX INTEGER AT POSITION-2
		assertEquals(expected, actual2);
		Integer actual3 = MaxOfThreeValues.findMax(1, 2, 3); // MAX INTEGER AT POSITION-3
		assertEquals(expected, actual3);
	}

	// TEST CASES - 2.1, 2.2, 2.3
	@Test
	public void testMaxFloat() {
		Float expected = 3f;
		Float actual1 = MaxOfThreeValues.findMax(3f, 2f, 1f); // MAX FLOAT NUMBER AT POSITION-1
		assertEquals(expected, actual1);
		Float actual2 = MaxOfThreeValues.findMax(2f, 3f, 1f); // MAX FLOAT NUMBER AT POSITION-2
		assertEquals(expected, actual2);
		Float actual3 = MaxOfThreeValues.findMax(1f, 2f, 3f); // MAX FLOAT NUMBER AT POSITION-3
		assertEquals(expected, actual3);
	}

	// TEST CASES - 3.1, 3.1, 3.3
	@Test
	public void testMaxString() {
		String expected = "Peach";
		String actual1 = MaxOfThreeValues.findMax("Peach", "Apple", "Banana"); // MAX STRING AT POSITION-1
		assertEquals(expected, actual1);
		String actual2 = MaxOfThreeValues.findMax("Apple", "Peach", "Banana"); // MAX STRING AT POSITION-2
		assertEquals(expected, actual2);
		String actual3 = MaxOfThreeValues.findMax("Apple", "Banana", "Peach"); // MAX STRING AT POSITION-3
		assertEquals(expected, actual3);
	}

	@Test
	public void variableArguments() {
		String expected1 = "Canvas";
		String actual1 = MaxOfThreeValues.findMax("Can", "Canvas");
		assertEquals(expected1, actual1);
		String actual2 = MaxOfThreeValues.findMax("Canvas", "Candle", "Can");
		assertEquals(expected1, actual2);
		String actual3 = MaxOfThreeValues.findMax("Candle", "Can", "Candy", "Canvas");
		assertEquals(expected1, actual3);
		Float expected2=1024f;
		Float actual4 = MaxOfThreeValues.findMax(1024f,256f,128f);
		assertEquals(expected2, actual4);
		Float actual5 = MaxOfThreeValues.findMax(8f,256f,128f,1024f);
		assertEquals(expected2, actual5);
	}
}