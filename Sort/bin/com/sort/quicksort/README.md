quickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

    Always pick first element as pivot.
    Always pick last element as pivot
    Pick a random element as pivot.
    Pick median as pivot. (implemented below)

The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.


//Algorithm:
/* lo  --> Starting index,  hi  --> Ending index */

quickSort(arr[], lo, hi)
{
    if (lo <= hi)
    {
        /* index is partitioning index, arr[pi] is now
           at right place */
        pi = partition(arr, low, high);

        quicksort(arr, low, index - 1);  // before index
        quicksort(arr, index, hi); // from index 
    }
}

Time Complexity : 
	best: O(nlog(n))
	average: O(nlog(n))
	worst: O(n^2) (worst case occurs when the array is already sorted)
				  (to avoid worst case we assign the pivot as random)
			
Space Complexity:
	best: O(1)
	average: O(1)
	worst: O(log(n))



