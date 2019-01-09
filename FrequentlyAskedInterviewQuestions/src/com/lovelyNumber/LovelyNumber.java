package com.lovelyNumber;

public class LovelyNumber {
	
	public static int uniqueDigits(int start, int end)
	{
		int count=  0;
		for(int i = start; i < end+1; i++)
		{
			if(check(i))
			{
				System.out.println(i);
				count++;
			}
		}
		return count;
		
	}
	private static boolean check(int number)
	{
		int arr[] = new int [10];
		while(number > 0)
		{
			int digit = number%10;
			if(arr[digit] > 0)
				return false;
			arr[digit]++;
			number = number/10;
		}
		
		return true;
		
	}
	public static void main(String args[])
	{
		System.out.println("Count: "+uniqueDigits(100,200));
	}

}
