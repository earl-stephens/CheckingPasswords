package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/* Coding challenge
		 * Write a program that asks a user to input their password.
		 * The program outputs "Password correct" or "Password
		 * incorrect", after comparing the user input to the stored
		 * password.
		 */

		final String STORED_PASSWORD = "secure";
		
		System.out.println("Enter your password and hit return.");
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		scanner.close();
		
		if(userInput.equals(STORED_PASSWORD)) {
			System.out.println("Password correct");
		}
		else {
			System.out.println("Password incorrect");
		}
	}

}
