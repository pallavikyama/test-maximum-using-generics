package com.blz.testmaximum;

public class MaxOfThreeValues {

	protected static <E extends Comparable<E>> E findMax(E x, E y, E z) {
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
		System.out.println("The greatest of the three integers is: " + findMax(315, 325, 300));
		System.out.println("The greatest of the three float numbers is: " + findMax(315f, 325f, 300f));
		System.out.println("The greatest of the three strings is: " + findMax("cat", "rat", "mat"));
	}
}