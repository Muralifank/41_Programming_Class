package com.Program_Class;

public class Fibanacci { // adding the next number eg: 1+2=3, 2+3=5, 3+5=8

	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
