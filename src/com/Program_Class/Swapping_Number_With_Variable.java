package com.Program_Class;

import java.util.Scanner;

public class Swapping_Number_With_Variable {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are");
		a = sw.nextInt();
		b = sw.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("swapping numbers are");
		System.out.println(a);
		System.out.println(b);
	}
}
