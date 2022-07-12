package com.Program_Class;

import java.util.Scanner;

//The String is  called a Palindrome String if  the reverse of that string is the same as the Original String
public class Palindrome_String {

	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");

	} // Eg: madam,radar,level
}
