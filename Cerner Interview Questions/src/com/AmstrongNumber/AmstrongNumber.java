package com.AmstrongNumber;

public class AmstrongNumber {
	public static boolean armstrong(int number)
	{
		int n = 0;
		int x = number;
		while(number > 0)
		{
			n += Math.pow(number%10,3);
			number = number/10;
		}
		return n==x;
	}
	
	public static void main(String args[])
	{
		int number = 407;
		System.out.println(armstrong(number));
	}
}
