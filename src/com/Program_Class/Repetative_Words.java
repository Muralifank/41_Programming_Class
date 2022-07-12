package com.Program_Class;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_Words {
	public static void main(String[] args) {

		String s = "java selenium java selenium selenium maven";
		Map<String, Integer> m = new HashMap<String, Integer>();

		// 1.Take first word
		// 2.Compare with other words
		// 3.Increase the count if both match

		String[] allWords = s.split(" "); // storing multiple values in single variable
                                         // without space=== letter will be count
		for (String word : allWords) {

			if (m.containsKey(word)) {
				// increase the count +1;
				// how to get a value from entry of a map; // m.get()====importance==
				Integer value = m.get(word);
				m.put(word, value + 1);
			} else {

				m.put(word, 1);
			}

		}

//		System.out.println(m);

		Set<Entry<String, Integer>> entrySet = m.entrySet(); // set doesnt allow duplicates

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}

		}

	}

}
