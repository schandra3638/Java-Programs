package com.programs.numbers;

public class MultipleOfThreeAndFive {
	
	public static void main(String[] args) {
		
		int multipleOfThree =0; int multipleOfFive =0;
		
		for(int i =1;i<=15;i++) {
			
			if(i%3==0)
			{
				multipleOfThree++;
				
			}
			if(i%5==0)
			{
				multipleOfFive++;
				
			}		
			
			if(multipleOfThree>0 && multipleOfFive ==0 )
			{
				System.out.println("Mutilple Of Three :"+i);
			}
			if(multipleOfFive>0 && multipleOfThree ==0)
			{
				System.out.println("Mutilple Of Five :" +i);
			}
			
			if(multipleOfThree>0 && multipleOfFive>0)
			{
				System.out.println("Mutilple Of Three And Five: "+i);
			}
			
			multipleOfThree =0; multipleOfFive =0;
		}
		
		
		
		
	}
		
		
				
	

}
