package com.employee;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "abcd";
		String rev = "";
		
//		int len = str.length();
//		
//		for( int i = len-1;i>=0;i--)
//		{
//			rev = rev+str.charAt(i);
//		}
//		
//		System.out.println("reversed String:"+rev);
//	}
//	
//
//}
		
		 char a[]=str.toCharArray();
		 int len = a.length;
		 
		 for (int i=len-1; i>=0; i--)
		 {
			 rev = rev+a[i];
			 
		 }
		 System.out.println("reversed:"+ rev);
		 }

	private static String len(int i) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

