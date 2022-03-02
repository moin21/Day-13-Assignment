package com.maxof3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * creating object
		 */
		MaxOfThree max = new MaxOfThree();
		/*
		 * taking input from user
		 */
		System.out.println("Please enter the first number: ");
		Integer first = sc.nextInt();
		System.out.println("Please enter the second number: ");
		Integer second = sc.nextInt();
		System.out.println("Please enter the third number: ");
		Integer third = sc.nextInt();
		/*
		 * Using findingMethod with user inputs
		 */
		max.findingMax(first, second, third);
	}

}