package com.maxof3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * creating object
		 */
		MaxOfThree max;
		/*
		 * taking input from user
		 */
		while(true) {                                                                         // asking user to select the generic type
			System.out.println(" \n 1. Integers\n 2. Float\n 3. String\n 4. Exit");
			System.out.print(" Please enter your choise from above:  \n ");
			int opt = scan.nextInt();
			
			switch(opt) {                                                                     //taking input from user
			case 1:
			{
				System.out.print(" Please enter the first Integer value: ");
				Integer first = scan.nextInt();
				
				System.out.print(" Please enter the second Integer value: ");
				Integer second = scan.nextInt();
				
				System.out.print(" Please enter the third Integer value: ");
				Integer third = scan.nextInt();
				max = new MaxOfThree<Integer>(first, second, third);                             //creating object 
				max.MaxOfThree();
				break;
			}				
			case 2:
			{
				System.out.print(" Please enter the first float value: ");
				Float first = scan.nextFloat();
				
				System.out.print(" Please enter the second float value: ");
				Float second = scan.nextFloat();
				
				System.out.print(" Please enter the third float value: ");
				Float third = scan.nextFloat();
				max = new MaxOfThree<Float>(first, second, third);                             //creating object 
				max.MaxOfThree();
				break;
			}
			case 3:
			{
				System.out.print(" Please enter the first string : ");
				String first = scan.next();
				
				System.out.print(" Please enter the second string: ");
				String second = scan.next();
				
				System.out.print(" Please enter the third string: ");
				String third = scan.next();
				max = new MaxOfThree<String>(first, second, third);                             //creating object 
				max.MaxOfThree();
				break;
			}
			case 4:
				System.out.println(" You have exited from the program!!");
				scan.close();
				return;
			default:
				System.out.println("Please enter a valid input from above");				
			}
				
		}
	}

}