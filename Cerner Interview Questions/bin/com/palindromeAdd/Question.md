Given an initial number, reverse it and add it back to the  initial. Check if new number is a palindrome. If not repeat till is. If yes display how many iterations it took and the number.

Example: 
Input : 1892
Output: 4
Explanation:

Iteration 1: 1892 + 2981 (reverse of 1892) = 4873
4873 is not a palindrome, so continue

Iteration 2: 4873 + 3784(reverse of 4873) = 8657
8657 is not a palindrome, so continue the process

Iteration 3: 8657 + 7568(reverse of 8657) = 11352
11352 is not a palindrome, so continue te process

Iteration 4: 11352 + 25311(reverse of 11352) = 36663
36663 is a palindromic number and so return the number of iterations the  orignal number(1892) took to reach the palindromic number which is 4