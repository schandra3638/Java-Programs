package com.programs.string;

import java.util.ArrayList;
import java.util.List;

public class FindingDublicatesInString {
	
	public static void main(String[] args) {
		
		String input = "sharath";
		
		List<Character> dublicates = new ArrayList<Character>();
		
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j) & dublicates.contains(input.charAt(i))==false )
				{
					dublicates.add(input.charAt(i));
				}
			}
		}
		
		System.out.println("Dublicate Characters In Given Steing = "+dublicates);
	}

}