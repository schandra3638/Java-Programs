package com.programs.string;

public class ReverseString_WithStringBuilder {

	public static void main(String[] args) {

		String input = "sharath";
		String output = "";

		StringBuilder sb = new StringBuilder(input);
		output = sb.reverse().toString();
		
		System.out.println(output);

	}

}
