package com.ss.jb.one;

public class Assignment_1_1 {
	public static void main(String[] args) {
        // Run through the 4 print outs for assignment 1.1
		printPattern(1);
		printPattern(2);
		printPattern(3);
		printPattern(4);	
    } 
	
	public static void printPattern(int selector) {
		String stars = "";
		String spaces = "";
		switch(selector) {
			case 1:
				System.out.println("1)");
				stars = "";
				for(int i = 0; i <= 3; i++) {
					stars = stars + "*";
					System.out.println(stars);
				}
				System.out.println(".........");
				break;
			case 2:
				System.out.println("2)");
				System.out.println("..........");
				stars = "****";
				for(int i = 3; i >= 0; i--) {
					System.out.println(stars);
					stars = stars.substring(0, stars.length() - 1);
				}
				break;
			case 3:
				System.out.println("3)");
				stars = "*";
				spaces = "     ";
				for(int i = 0; i <= 3; i++) {
					System.out.println(spaces + stars);
					stars = stars + "**";
					spaces = spaces.substring(0, spaces.length() - 1);
				}
				System.out.println("...........");
				break;
			case 4:
				System.out.println("4)");
				System.out.println("............");
				stars = "*********";
				spaces = "  ";
				for(int i = 0; i <= 3; i++) {
					stars = stars.substring(0, stars.length() - 2);
					System.out.println(spaces + stars);
					spaces = spaces + " ";
				}
				break;
			default:
				System.out.println("Failed");
				break;
		}
	}
}
