package com.Program_Class;

//Kth largest or smallest element in an array
//Example : if given array is [1,3,12,19,13,2,15] and you are asked for the 3rd largest
//element i.e., k=3 then your program should print 13

public class Third_Largest {

	public static void main(String[] args) {
		int a[] = { 1, 3, 12, 19, 13, 2, 15 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		System.out.println("The Third maximum number is :" + a[a.length - 5]);
	}

}
