package com.Program_Class;

public class Count_Of_Odd_Number {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
