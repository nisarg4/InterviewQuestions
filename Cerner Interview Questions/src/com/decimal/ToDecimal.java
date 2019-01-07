package com.decimal;

public class ToDecimal {
	
	int binTodec(int number)
	{
		int decimal = 0,n = 0;
		if(number%10 > 1)
			return -1;
		while(number > 0)
		{
			int temp = number%10;
			decimal += temp * Math.pow(2,n);
			number = number/10;
			n++; 
		}
		return decimal;
	}
	int hexTodec(String number)
	{
		String digits = "0123456789ABCDEF";
		int val = 0;
		number = number.toUpperCase();
		for(int i = 0; i < number.length(); i++)
		{
			char c = number.charAt(i);
			int d = digits.indexOf(c);
			val = 16*val + d;
		}
		return val;
	}
	public static void main(String args[])
	{
		ToDecimal td = new ToDecimal();
		System.out.println(td.binTodec(11010));
		System.out.println(td.hexTodec("121ac"));
	}

}
