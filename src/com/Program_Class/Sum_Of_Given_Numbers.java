package com.Program_Class;

public class Sum_Of_Given_Numbers {
	public static void main(String args[]) {
		int m, n, sum = 0;
		m = 7878743; // sum of these number
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		System.out.println("Sum of Digits:" + sum);
	}

}
