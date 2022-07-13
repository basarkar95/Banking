package com.example2;

public class Fibonciiserise {
	
public static void main(String[] args) {
	int n=0, no=1, a;
	
	System.out.println(n+""+no);
	
	for(int i=2;i<=5;++i)
	{
		a=n+no;
		
		System.out.println(""+a);
		
		n=no;
		no=a;
	}
	
	
}
}
