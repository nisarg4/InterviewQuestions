A sequence of n numbers (n < 3000) is called Jolly Jumper if the absolute values of the differences between the successive elements take on all possible values from 1 through n-1. The definition implies that any sequence of a single integer is a jolly jumper.

Input: 1 4 2 3
Output: True
This sequence 1 4 2 3 is Jolly Jumper because
the absolute differences are 3, 2, and 1.

Input: 1 4 2 -1 6  
Output: False
The absolute differences are 3, 2, 3, 7. 
This does not contain  all the  values from 1 
through n-1. So, this sequence is not Jolly.

Input: 11 7 4 2 1 6
Output: Trues