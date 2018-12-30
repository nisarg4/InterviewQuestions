package com.sort.mergesort;

import java.util.Arrays;

import com.sort.mergesort.MergeSort;

public class MergeSort {
	
	void mergesort(int arr[]) 
	{
		mergesort(arr,0,arr.length-1);
	}
	void mergesort(int arr[],int lo, int hi) 
	{
		if(lo >= hi)
			return;
		int mid = lo + (hi - lo)/2;
		mergesort(arr,lo,mid);
		mergesort(arr,mid+1,hi);
		
		int aux[] = new int[hi-lo+1];
		
		int i = lo;
		int j = mid+1;
		int k = 0;
		
		while(i <= mid || j <= hi) 
		{
			if(i > mid)
				aux[k++] = arr[j++];
			else if(j > hi)
				aux[k++] = arr[i++];
			else if(arr[i] > arr[j])
				aux[k++] = arr[j++];
			else
				aux[k++] = arr[i++];
		}
		// Copy merged portion back into original array.
		for(i = lo; i <=hi; i++)
			arr[i] = aux[i-lo];
	}
	public static void main(String[] args) {
		MergeSort sort = new MergeSort();

		if (args.length < 1) {
			System.err.println("Proper Syntax : java QuickSort <n>");
			return;
		}
		int n = Integer.parseInt(args[0]);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println("Unsorted array: ");
		System.out.println(Arrays.toString(arr));

		sort.mergesort(arr);

		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

}
