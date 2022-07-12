package com.Program_Class;

public class Split_String_Basic {

	public static void main(String[] args) {
		String s1 = "Hello welcome to java class";
		String[] x = s1.split(" "); // here we split by space
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
