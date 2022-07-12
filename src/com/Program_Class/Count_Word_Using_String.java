package com.Program_Class;

import java.util.HashMap;
//Count of each word in the string:
public class Count_Word_Using_String {
	public static void main(String args[]) {
		{
			String s = "vengat lord vengat murali king ram";// words are given here
			String[] s1 = s.split(" ");
			HashMap<String, Integer> emp = new HashMap<String, Integer>();
			for (String c : s1) {
				if (emp.containsKey(c)) {
					int x = emp.get(c);
					emp.put(c, x + 1);
				} else {
					emp.put(c, 1);
				}
			}
			System.out.println(emp);
		}
	}

}
