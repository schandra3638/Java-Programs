package com.programs.string;

import java.util.Arrays;

public class ReverseString_WithArrays {

	public static void main(String[] args) {

		String input = "sharath";

		char string[] = input.toCharArray();

		Arrays.sort(string);
		
		System.out.println( Arrays.toString(string));			
		
	}

}
