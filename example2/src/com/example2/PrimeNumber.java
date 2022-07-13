package com.example2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number ;
		int a=1;
		int j ;
		
		while(a <=100)
		{
			number =2;
			j=0;
			while(number<=a/2)
			{
				if(a % number==0)
				{
					j++;
					
				}
				number++;
			}
			if(j==0 && a!=1)
			{
				System.out.println(a +"");
			}
			
			a++;
		}
		
	
	}
	
}
