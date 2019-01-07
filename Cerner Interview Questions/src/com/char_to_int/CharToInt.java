package com.char_to_int;

public class CharToInt {
	
	String convert(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++)
		{
			int num = s.charAt(i) - 'a';
			sb.append(num);
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		String s = "abcdefghi"; //12345678
		CharToInt cti = new CharToInt();
		System.out.println(cti.convert(s));
	}

}
