package com.Program_Class;

import java.util.Scanner;

public class Palindrome_Number_Check {

	public static void main(String[] args) {
		int n, a, i = 0, j = 0;
		Scanner an = new Scanner(System.in);
		System.out.println("Enter a number");
		n = an.nextInt();
		a = n;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		if (n == j) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome Number");
		}

	} // 0,1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,101,111,121,.... 98789,199991


	
	


}
