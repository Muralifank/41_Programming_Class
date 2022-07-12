package com.Program_Class;

public class Sum_Of_Even_Numbers {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				count = count + i;
			}
		}
		System.out.println(count);
	}

}
