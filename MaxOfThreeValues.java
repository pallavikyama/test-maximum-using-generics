package com.blz.testmaximum;

public class MaxOfThreeValues<E extends Comparable<E>> {

	E x, y, z; // VARIABLES

	protected MaxOfThreeValues(E x, E y, E z) { // PARAMETER CONSTRUCTOR
		this.x = x;
		this.y = y;
		this.z = z;
		findMax(x, y, z);
	}

	protected static <E extends Comparable<E>> E findMax(E x, E y, E z) {
		System.out.println("The greatest of the three values is: ");
		if (x.compareTo(y) > 0) {
			if (y.compareTo(z) > 0 || x.compareTo(z) > 0) {
				System.out.println(x);
				return x;
			}
			else {
				System.out.println(z);
				return z;
			}
		} else {
			if (y.compareTo(z) > 0) {
				System.out.println(y);
				return y;
			}
			else {
				System.out.println(z);
				return z;
			}
		}
	}

	public static void main(String[] args) {
		new MaxOfThreeValues<Integer>(315, 325, 300);
	}
}