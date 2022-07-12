package com.Program_Class;

public class Factorial_Numbers {  //8!== 8*7*6*5*4*3*2*1

	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 8; i++) {
			count = count * i;
		}
		System.out.println(count);
	}
}
