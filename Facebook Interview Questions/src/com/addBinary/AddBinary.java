package com.addBinary;

public class AddBinary {
	
	public String addBinary(String a, String b) 
	{
		if(a.length() == 0 || a == null)
			return b;
		if(b.length() == 0 || b == null)
			return a;
		int i = a.length() - 1, j = b.length() - 1,carry = 0;
		StringBuilder res = new StringBuilder();
		while(i >= 0 || j >=0) 
		{
			int sum = carry;
			if(i >= 0)sum += (int)a.charAt(i--) - '0';
			if(j >=0)sum += (int)b.charAt(j--) - '0';
			
			res.append(sum%2);
			carry = sum/2;
		}
		if(carry > 0)
			res.append(1);
		
		return res.reverse().toString();
	}

	public static void main(String[] args) {
		
		AddBinary add = new AddBinary();
		System.out.println(add.addBinary("11", "1")); //100
		System.out.println(add.addBinary("1010", "1011")); //10101
	}

}
