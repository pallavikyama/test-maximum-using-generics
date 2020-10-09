package com.blz.testmaximum;

public class MaxOfThreeValues {

	protected static String findMaxString(String x, String y, String z) {
		if (x.compareTo(y) > 0) {
			if (y.compareTo(z) > 0 || x.compareTo(z) > 0)
				return x;
			else
				return z;
		} else {
			if (y.compareTo(z) > 0)
				return y;
			else
				return z;
		}
	}

	public static void main(String[] args) {
		System.out.println("The greatest of the three integers is: " + findMaxString("cat", "rat", "mat"));
	}
}