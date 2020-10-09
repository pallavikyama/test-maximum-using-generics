package com.blz.testmaximum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseForMaxValue {
	
	// TEST CASES-1.1,1.2,1.3
	@Test
	public void TestMaxInt() {
		Integer expected = 3;
		Integer actual1 = MaxOfThreeValues.findMaxInt(3, 2, 1); // MAX AT POSITION-1
		assertEquals(expected, actual1);
		Integer actual2 = MaxOfThreeValues.findMaxInt(2, 3, 1); // MAX AT POSITION-2
		assertEquals(expected, actual2);
		Integer actual3 = MaxOfThreeValues.findMaxInt(1, 2, 3); // MAX AT POSITION-3
		assertEquals(expected, actual3);
	}
}