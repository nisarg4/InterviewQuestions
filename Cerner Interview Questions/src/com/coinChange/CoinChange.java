package com.coinChange;

import java.util.Arrays;

public class CoinChange {
	
	int cc_dp(int[] denoms,int amount)
	{
		Arrays.sort(denoms);
		int oo = (int)1e9;
		int matrix[] = new int[amount+1];
		Arrays.fill(matrix,oo);
		matrix[0] = 0;
		for(int a = 0; a <= amount; a++)
		{
			System.out.println("a : "+a);
			for(int k = 0; k < denoms.length; k++)
			{
				matrix[a] = Math.min(matrix[a],(denoms[k] <= a)? 1 + matrix[a-denoms[k]] : oo);
				System.out.println("for "+denoms[k]+" : "+matrix[a]);
			}
			
			
		}
		return matrix[amount];
	}
	public static void main(String args[])
	{
		int denominations[] = {1,3,5,6,7};
		int amount = 11;
		CoinChange cc = new CoinChange();
		System.out.println(cc.cc_dp(denominations,amount));
	}
}
