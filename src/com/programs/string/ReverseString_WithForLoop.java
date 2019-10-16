package com.programs.string;

public class ReverseString_WithForLoop {
	public static void main(String[] args) {

		String input = "Sharath";
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			output = output + input.charAt(i);
		}

		System.out.println("1st way output = " + output);

	}

}
