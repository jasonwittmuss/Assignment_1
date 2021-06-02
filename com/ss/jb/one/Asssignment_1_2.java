package com.ss.jb.one;
import java.util.Random;
import java.util.Scanner;

// Assignment 1.2
public class Asssignment_1_2 {
	public static void main(String[] args) {
		// Start the guessing game
		guessingGame();
	}
	
	public static void guessingGame() {
		// Randomly generate a number to guess and initialize variables
		Random rand = new Random();
		int secret = rand.nextInt(100) + 1;
		
		Scanner input = new Scanner(System.in);
		
		int guess = -100;
		int attempts = 0;
		
		// Game loop
		while(attempts < 5) {
			System.out.println("Guess a number (1-100): ");
			
			// Get guess from player. Check if its a number and between 1 and 100
			// If it is, determine if they win, lose, or need to continue
			try {
				guess = input.nextInt();
			} catch (Exception e) {
				System.out.println("Guess must be a number between 1 and 100");
				input.nextLine();
				continue;
			}
			
			if ((guess > 0) && (guess <= 100)) {
				attempts += 1;
				if ((guess >= secret - 10) && (guess <= secret + 10)) {
					System.out.println("Success! The correct answer was: " + secret);
					input.close();
					return;
				}
				else {
					System.out.println("Wrong, you have used " + attempts + " attempts.");
				}
			}
			else {
				System.out.println("Your guess was outside the range.");
			}
			
		}
		System.out.println("Sorry. You exceeded 5 attempts. The correct answer was: " + secret);
		input.close();
	}
}
