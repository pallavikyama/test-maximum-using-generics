package com.blz.testmaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseForMaxValue {
	
	// TEST CASES-1.1,1.2,1.3
	@Test
	public void TestMaxFloat() {
		Float expected = 3f;
		Float actual1 = MaxOfThreeValues.findMaxFloat(3f, 2f, 1f); // MAX AT POSITION-1
		assertEquals(expected, actual1);
		Float actual2 = MaxOfThreeValues.findMaxFloat(2f, 3f, 1f); // MAX AT POSITION-2
		assertEquals(expected, actual2);
		Float actual3 = MaxOfThreeValues.findMaxFloat(1f, 2f, 3f); // MAX AT POSITION-3
		assertEquals(expected, actual3);
	}
}