package com.Program_Class;

import java.util.Scanner;

//Write a program to split and then reverse a string:
public class Reverse_String_1 {

	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of entered string is: " + reverse);
	}
}
