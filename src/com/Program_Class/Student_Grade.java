package com.Program_Class;

import java.util.Scanner;

public class Student_Grade {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		System.out.println("enter value:");
		int n = sm.nextInt();
		if (100 >= n && n >= 90) {
			System.out.println("S grade");
		} else if (89 >= n && n >= 80) {
			System.out.println("A grade");
		} else if (79 >= n && n >= 70) {
			System.out.println("B grade");
		} else if (69 >= n && n >= 60) {
			System.out.println("C grade");
		} else if (59 >= n) {
			System.out.println("Fail");
		}
	}
}
