package com.Nqueens;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	
	 public List<List<String>> solveNQueens(int N) {
		 List<List<String>>result = new ArrayList<List<String>>();
	       int[] queens = new int[N];
			boolean used_rows[] = new boolean[N];
			boolean md[] = new boolean[2 * N];
			boolean cd[] = new boolean[2 * N];
			Nqueens(queens,used_rows,md,cd,0,result);
			return result;
		}
	void Nqueens(int[] queens,boolean[] used_rows,boolean[] md, boolean[] cd, int col,List<List<String>>result) 
		{
			if(col == queens.length) 
			{
				result.add(print(queens));
				return;
			}
			for(int row = 0; row < queens.length; row++) 
			{
				int md_index = col + row;
				int cd_index = col - row + (queens.length-1);
				if(!used_rows[row] && !md[md_index] && !cd[cd_index]) 
				{
					used_rows[row] = md[md_index] = cd[cd_index] = true;
					queens[col] = row;
					Nqueens(queens,used_rows,md,cd,col+1,result);
					used_rows[row] = md[md_index] = cd[cd_index] = false;
				}
			}
			
		}
		List<String> print(int[] queens) 
		{
	        
	        List<String> list = new ArrayList<>();
	       
			for(int row = 0; row < queens.length; row++) 
			{
				 String s = "";
				for(int col = 0; col < queens.length; col++) 
				{
					s+=(queens[col] == row ? 'Q' : '.');
				}
				list.add(s);
			}
			return list;
		}
	public static void main(String args[]) {
		NQueens nq = new NQueens();
		
		int N = args.length < 1 ? 4 : Integer.parseInt(args[0]);
		System.out.println(nq.solveNQueens(N));
		
	}

}
