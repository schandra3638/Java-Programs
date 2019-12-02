package com.programs.numbers;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int input =123; int output=0;
		
		while(input>0)
		{
			output = output*10;
			int temp = input%10;
			output = output+temp;
			input = input/10;
			
		}
		
		System.out.println(output);
	}

}
