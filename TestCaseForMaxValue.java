package com.blz.testmaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseForMaxValue {

	// TEST CASES-1.1,1.2,1.3
	@Test
	public void TestMaxFloat() {
		String expected = "Peach";
		String actual1 = MaxOfThreeValues.findMaxString("Peach", "Apple", "Banana"); // MAX AT POSITION-1
		assertEquals(expected, actual1);
		String actual2 = MaxOfThreeValues.findMaxString("Apple", "Peach", "Banana"); // MAX AT POSITION-2
		assertEquals(expected, actual2);
		String actual3 = MaxOfThreeValues.findMaxString("Apple", "Banana", "Peach"); // MAX AT POSITION-3
		assertEquals(expected, actual3);
	}
}