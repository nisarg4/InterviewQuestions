package com.repeatedSubSting;

public class RepeatedSubstring {
	static int[] computeLPSArray(String str, int M,int lps[])
	{
		int len = 0; 
     
		int i;
 
		lps[0] = 0; // lps[0] is always 0
		i = 1;
 
		while (i < M)
		{
			if (str.charAt(i) == str.charAt(len))
			{
				len++;
				lps[i] = len;
				i++;
			}
			else 
			{
				if (len != 0)
				{
					
					len = lps[len-1];
 
		
				}
				else 
				{
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	static int isRepeat(String str)
	{

		int n = str.length();
		int lps[] = new int[n];
 

		int arr[] = computeLPSArray(str, n, lps);
 

		int len = arr[n-1];
		if(len > 0 && n%(n-len) == 0)
			return n/(n-len);
 

		return -1;
	}
 

	public static void main(String[] args)
	{
		String txt[] = {"GEEKGGEEK", "ABABAB", "ABCDABCD", "GEEKSFORGEEKS", "GEEKGEEK", "AAAACAAAAC", "ABCDABC"};
		int n = txt.length;
		for (int i = 0; i < n; i++)
		{
    			System.out.println(isRepeat(txt[i]));
   		}
	}
}
