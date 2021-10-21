package com.debugger.java.challenges;

import java.util.Scanner;

/*
 * Verify if a number is even or odd
 * If the number is even, function returns true
 * If the number is odd, function returns false
 * The input must be an integer
 */
public class EvenOrOdd {

	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userNum = scanner.nextInt();
		System.out.println("Is the number even? " + isEven(userNum));
	}

}
