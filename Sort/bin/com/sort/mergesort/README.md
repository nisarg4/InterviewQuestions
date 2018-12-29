Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. The merging two halves is key process that assumes that arr[lo..mid] and arr[mid+1..hi] are sorted and merges the two sorted sub-arrays into one.

Algorithm:

	MergeSort(arr[], lo,  hi)
	If hi > lo
	     1. Find the middle point to divide the array into two halves:  
	             middle mid = lo + (hi-lo)/2
	     2. Call mergeSort for first half:   
	             Call mergeSort(arr, lo, mid)
	     3. Call mergeSort for second half:
	             Call mergeSort(arr, mid+1, hi)
	     4. Merge the two halves sorted in step 2 and 3:
	             for (i = lo; i <= hi; i++)
						arr[i] = aux[i - lo]
Time Complexity : 
	best: O(nlog(n))
	average: O(nlog(n))
	worst: O(nlog(n))
				
Space Complexity:
	best: O(n)
	average: O(n)
	worst: O(n)