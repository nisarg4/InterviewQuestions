package com.ReverseString;

public class ReverseString {

	public static String reverse(String original) 
	{
		int lo = 0, hi = original.length()-1;
		
		char c[] = original.toCharArray();
		
		while(lo < hi) {
			char temp = c[lo];
			c[lo] = c[hi];
			c[hi] = temp;
			
			lo++;
			hi--;
		}
		return new String(c);
	}
	public static void main(String args[])
	{
		String original = "Hello";
		String rev = reverse(original);
		System.out.println(rev);
	}
}
