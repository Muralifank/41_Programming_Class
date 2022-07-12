package com.Program_Class;

import java.util.HashMap;

//Count of each character in the string:
public class Count_Of_Each_Character_String {

	public static void main(String args[]) {
		{
			String s = "murali the king";
			HashMap<Character, Integer> emp = new HashMap<Character, Integer>();
			char[] ch = s.toCharArray();
			for (char c : ch) {
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
