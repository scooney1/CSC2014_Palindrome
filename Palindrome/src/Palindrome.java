/**
 * Author:	Sam Cooney
 * Project:	Palindrome
 * Date:	Oct 25, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "NONE";
		
		do {
			
			System.out.println("Enter a palindrome or NONE if you are finished.");
			input = scan.nextLine();
			int length = input.length();
			for(int i = 0;i < length;i++) {
				int reverse = length - (i + 1);
				char a = input.charAt(i);
				char b = input.charAt(reverse);
				
				if(a != b) {
					
					i = input.length();
					if(!input.equals("NONE")) {
					
						System.out.println("You suck, enter a palindrome.");
					}
				} else if(i == input.length() - 1) {
					
					System.out.println("Congrats " + input + " is a palindrome.");
				}
			}
		} while(!input.equals("NONE"));
		scan.close();
	}

}
