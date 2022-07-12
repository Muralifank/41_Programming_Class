package com.Program_Class;

public class Armstrong_Number_Print_1000 { // to print Armstrong number (1 to 1000)

	public static void main(String[] args) {
		for (int n = 1; n <= 1000; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
			}
			if (n == j) {
				System.out.println(n);
			}
		}
	}
}
