package com.Program_Class;

import java.util.Scanner;

public class To_Find_Odd_Or_Even_Number {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = e.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

}
