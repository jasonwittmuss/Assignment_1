package com.ss.jb.one;
import java.util.Random;
import java.util.Scanner;

public class Asssignment_1_2 {
	public static void main(String[] args) {
		guessingGame();
	}
	
	public static void guessingGame() {
		Random rand = new Random();
		int secret = rand.nextInt(100) + 1;
		
		Scanner input = new Scanner(System.in);
		
		int guess = -100;
		int attempts = 0;
		
		while(attempts < 5) {
			System.out.println("Guess a number (1-100): ");
			
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