package com.programs.string;

import java.util.ArrayList;
import java.util.List;

public class FindingUniqueCharactersInString {

	public static void main(String[] args) {

		String str = "Sharath";

		List<Character> dublicates = new ArrayList<Character>();
		List<Character> unique = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {
			int temp = 0;

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) & dublicates.contains(str.charAt(i)) == false) {

					dublicates.add(str.charAt(i));
				}

				else if (str.charAt(i) == str.charAt(j)) {
					temp++;
				}

			}

			if (temp == 0 & dublicates.contains(str.charAt(i)) == false) {

				unique.add(str.charAt(i));

			}
		}

		System.out.println("Unique Characters In Given Steing = "+unique);

	}

}
