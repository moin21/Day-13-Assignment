package com.maxof3;

public class MaxOfThree {
	public <T extends Comparable<T>> void findingMax(T first, T second, T third) {
		/*
		 * considering first is max and assigning max to first
		 */
		T max = first;
		String position = "first";
		if (second.compareTo(max) > 0) {
			/*
			 * comparing with first max and if greater than 0 assigning to max
			 */
			max = second;
			position = "second";
		}
		/*
		 * comparing with max and if greater than 0 assigning to max
		 */
		if (third.compareTo(max) > 0) {
			max = third;
			position = "third";
		}
		System.out.println("The maximum is in " + position + " position and is : " + max);
	}
}
