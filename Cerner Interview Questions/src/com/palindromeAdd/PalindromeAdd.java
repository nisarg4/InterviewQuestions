package com.palindromeAdd;

public class PalindromeAdd {
	
	static int count = 0;
	public static int palindrome(int number)
	{
		int rev = reverse(number);
		int sum = add(number,rev);
		boolean flag = check(sum);
		if(flag == true)
			return 1;
		return 	1 + palindrome(sum);
	}
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
	public static int add(int rev,int number)
	{
		int sum = rev + number;
		return sum;
	}
	public static boolean check(int sum)
	{
		return(sum==reverse(sum));
	}
	
	public static void main(String args[])
	{
		int number = 1892;
		try{
			System.out.println(palindrome(number));
		}
		catch(StackOverflowError e)
		{
			System.out.println("Palindrome not possible");
		}
	}

}
