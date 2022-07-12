package com.Program_Class;

import java.util.Scanner;

//Sum of the cubes of its digits is equal to to the number itself
public class Armstrong_Number_Check {

	public static void main(String[] args) {
		int n, a, i = 0, j = 0;
		Scanner an = new Scanner(System.in);
		System.out.println("Enter a number");
		n = an.nextInt();
		a = n;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not armstrong Number");
		}
	} // 0,1,153,370,371,407,1634,8208,9474
		// [153 = 1^3+5^3+3^3 = 1+125=+27 == 153]
}
