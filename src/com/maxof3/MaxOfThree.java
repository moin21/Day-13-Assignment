package com.maxof3;

public class MaxOfThree<T extends Comparable<T>> {
	/*
	 * creating variable of generic type
	 */
	T first;
	T second;
	T third;

	/*
	 * constructor of generic type
	 */
	public MaxOfThree(T first, T second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void MaxOfThree() {
		MaxOfThree(this.first, this.second, this.third);
	}

	/*
	 * using generic type T and making the method generic.
	 */
	public <T extends Comparable<T>> void MaxOfThree(T first, T second, T third) {
		T max = first; // considering first is max and assigning max to first
		String position = "first"; // for displaying the position
		if (second.compareTo(max) > 0) {
			max = second; // comparing with first max and if greater that assigning to max
			position = "second";
		}
		if (third.compareTo(max) > 0) { // comparing with max value and if greater that assigning to max
			max = third;
			position = "third";
		}
		System.out.println("The maximum number is in " + position + " position and the number is : " + max);
	}

}