package com.reverseNumber;

public class ReverseNumber {

	public static int reverse(int number) 
	{
		long reverse  = 0;
		while(number != 0) 
		{
			int temp = number % 10;
			reverse = (reverse * 10) + temp;
			if( reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
                return 0;// avoid integer overflow (for input like 1534236469
		       
			number = number/10;
		}
		return (int)reverse;
	}
	public static void main(String[] args) {
		
		int number = 1982;
		System.out.println(reverse(number));
		
	}

}
