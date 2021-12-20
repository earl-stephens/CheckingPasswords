package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * Coding challenge Write a program that asks a user to input their password.
		 * The program outputs "Password correct" or "Password incorrect", after
		 * comparing the user input to the stored password.
		 */

		/*
		 * Second coding challenge Make the program repeat the request for user input if
		 * the user types the wrong password
		 */

		final String STORED_PASSWORD = "secure";

		System.out.println("Enter your password and hit return.");

		/*
		 * scanner itself isn't getting the input. It's scanning System.in for the input
		 */
		Scanner scanner = new Scanner(System.in);
		// String userInput = scanner.nextLine();

		while (true) {

			String userInput = scanner.nextLine();

			if (userInput.equals(STORED_PASSWORD)) {
				System.out.println("Password correct");
				break;
			} else {
				System.out.println("Incorrect password.  Enter your password and hit return.");
			}

		}
		scanner.close();
		System.out.println("Exiting.");
	}

}
