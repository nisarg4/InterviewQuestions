package com.validPalindrome;

import java.util.ArrayList;
import java.util.List;

public class validPalindrome {
	
	public boolean isValid(String s) {
		
		if(s == null)
			return true;
		
		String x = s.replaceAll("\\W","");//replace all the non-word characters with empty string
		int lo = 0, hi =x.length()-1;
		while(lo <= hi) 
		{
			if(Character.toLowerCase(x.charAt(lo)) != Character.toLowerCase(x.charAt(hi)))
				return false;
			else 
			{
				lo++;
				hi--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		validPalindrome v = new validPalindrome();
		List<String> list = new ArrayList<String>();
		list.add("A man, a plan, a canal: Panama"); //true
		list.add("race a car");//false
		for(String s : list)
			System.out.println(s+": "+v.isValid(s));

	}

}
