package com.debugger.java.challenges;

import java.util.Scanner;

/*
 * Verify a password. The password must:
 * Have at least six characters
 * Have one uppercase letter
 * Have one lowercase letter
 * Have one number
 */
public class PasswordComplexity {
	/*
	 * Function takes a String as input Returns a boolean output - indicates if a
	 * password is complex enough
	 */
	public static boolean isPasswordComplex(String password) {
		// password length must be 6 characters
		if (password.length() < 6) {
			System.out.println("Password must be 6 characters");
			return false;
		}
		boolean hasLowerCaseLetter = false;
		boolean hasUpperCaseLetter = false;
		boolean hasNumber = false;

		for (int i = 0; i < password.length() || (!hasLowerCaseLetter) && !hasUpperCaseLetter && !hasNumber; i++) {
			char current = password.charAt(i);

			if (Character.isDigit(current)) {
				hasNumber = true;
			} else if (Character.isUpperCase(current)) {
				hasLowerCaseLetter = true;
			} else if (Character.isLowerCase(current)) {
				hasUpperCaseLetter = true;
			}
		}
		return hasNumber && hasLowerCaseLetter && hasUpperCaseLetter;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a password: ");
		String userInput = scanner.nextLine();
		System.out.println("Is the password complex? " + isPasswordComplex(userInput));

	}

}
