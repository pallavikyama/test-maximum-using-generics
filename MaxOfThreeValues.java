package com.blz.testmaximum;

public class MaxOfThreeValues<E extends Comparable<E>> {
	protected static <E extends Comparable<E>> E findMax(E x, E... values) {
		E max = x;
		for (E i : values) {
			if (i.compareTo(max) > 0)
				max = i;
		}
		printMax(max);
		return max;
	}

	protected static<E extends Comparable<E>> void printMax(E max) {
		System.out.println("The greatest of the three values is: " + max);
	}

	public static void main(String[] args) {
		findMax(315,325,300);
	}
}