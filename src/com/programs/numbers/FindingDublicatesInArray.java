package com.programs.numbers;
import java.util.ArrayList;
import java.util.List;

public class FindingDublicatesInArray {
	
	
	public static void main(String[] args) {
		
		int arr[] = {0,3,7,7,2,2,1,3,5,4,3,0,2,6};
		
		List<Integer> dublicates = new ArrayList<Integer>();
		List<Integer> unique = new ArrayList<Integer>();
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++) 
			{
				
				if(arr[i]==arr[j] & dublicates.contains(arr[i])==false)
				{
					dublicates.add(arr[i]);
					
				}
				else if(arr[i]==arr[j]) {
					temp++;
				}
				
			}
			
			if(temp==0 & dublicates.contains(arr[i])==false )
			{
				unique.add(arr[i]);
			}
			
			temp=0;
		}
		System.out.println("Unique Numbers : "+unique);
		System.out.println("Dublicate Numbers : "+dublicates);
	}
	
	

}
