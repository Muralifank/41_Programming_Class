package com.Program_Class;

//. Write a program to find sum of each digit in the given number using recursion?
public class My_Number_Sum_Recursion {

	int sum = 0;

	public int getNumberSum(int number) {

		if (number == 0) {
			return sum;
		} else {
			sum += (number % 10);
			getNumberSum(number / 10);
		}
		return sum;
	}

	public static void main(String a[]) {
		My_Number_Sum_Recursion b = new My_Number_Sum_Recursion();
		System.out.println("Sum is: " + b.getNumberSum(5678));
	}

}
