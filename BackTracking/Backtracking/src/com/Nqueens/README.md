//Question
//Leetcode Q.51 N-Queens

The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
Given an integer n, return all distinct solutions to the n-queens puzzle.
Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

	Input: 4
	
	Output: [
	 [".Q..",  // Solution 1
	  "...Q",
	  "Q...",
	  "..Q."],
	
	 ["..Q.",  // Solution 2
	  "Q...",
	  "...Q",
	  ".Q.."]
	]
	Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.

//Solution

Backtracking Algorithm
The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.

	1) Start in the leftmost column
	2) If all queens are placed
	    return true
	3) Try all rows in the current column.  Do following for every tried row.
	    a) If the queen can be placed safely in this row then mark this [row, 
	        column] as part of the solution and recursively check if placing queen here leads to a solution.
	    b) If placing the queen in [row, column] leads to a solution then return 
	        true.
	    c) If placing queen doesn't lead to a solution then umark this [row, 
	        column] (Backtrack) and go to step (a) to try other rows.
	3) If all rows have been tried and nothing worked, return false to trigger 
	    backtracking.

