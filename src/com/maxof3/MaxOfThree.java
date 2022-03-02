package com.maxof3;

public class MaxOfThree {
	public void findingMax(Float first, Float second, Float third) {
		/*
		 * considering first is max and assigning max to first
		 */
		float max = first;
		String position = "first";
		if (second.compareTo(max) > 0) {
			/*
			 * comparing with first max and if greater than 0 assigning to max
			 */
			max = second;
			position = "second";
		}
		/*
		 * comparing with max Float and if greater than 0 assigning to max
		 */
		if (third.compareTo(max) > 0) {
			max = third;
			position = "third";
		}
		System.out.println("The maximum number is in " + position + " position and the number is : " + max);
	}
}
