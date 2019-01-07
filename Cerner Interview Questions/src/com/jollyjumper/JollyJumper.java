package com.jollyjumper;

public class JollyJumper {
	boolean verify(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int min = arr[0];
		for(int i = 0;i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		for(int i = 1; i < arr.length; i++)
		{
			if(Math.abs(arr[i] - arr[i-1]) > max || Math.abs(arr[i] - arr[i-1]) < min)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		int arr[] = {11,7,4,2,1,6};
		JollyJumper jj = new JollyJumper();
		System.out.println(jj.verify(arr));
	}
}
