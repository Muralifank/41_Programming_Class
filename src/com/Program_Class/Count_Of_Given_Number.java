package com.Program_Class;

import java.util.Scanner;

public class Count_Of_Given_Number {

	public static void main(String[] args) {
		int n, i = 0;
		System.out.println("enter a no");
		Scanner get = new Scanner(System.in);
		n = get.nextInt();
		while (n > 0) {
			n = n / 10;
			i++;
		}
		System.out.println("no of digits present:" + i);
	}

}
