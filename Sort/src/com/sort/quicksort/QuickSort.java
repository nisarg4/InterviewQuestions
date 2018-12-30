package com.sort.quicksort;

import java.util.Arrays;

public class QuickSort {

	void quicksort(int arr[]) {
		quicksort(arr, 0, arr.length - 1);
	}

	void quicksort(int arr[], int lo, int hi) {
		if (lo >= hi)
			return;
		int pivot = lo + (hi - lo) / 2; // avoid integer overflow
		int pivotValue = arr[pivot]; // pivot is the middle value of the array;
		int index = partition(arr, lo, hi, pivotValue);

		quicksort(arr, lo, index - 1);
		quicksort(arr, index, hi);

	}
	int partition(int arr[], int lo, int hi,int pivot) 
	{
		while(lo <= hi) 
		{
			while(lo < arr.length && arr[lo] < pivot) lo++;
			while(hi < arr.length && arr[hi] > pivot) hi--;
			
			if(lo <= hi) 
			{
				swap(arr,lo,hi);
				lo++;
				hi--;
			}
		}
		return lo;
	}
	void swap(int arr[],int lo, int hi) 
	{
		int temp = arr[lo];
		arr[lo] = arr[hi];
		arr[hi] = temp;
	}
	public static void main(String[] args) {

		QuickSort sort = new QuickSort();

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

		sort.quicksort(arr);

		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

}
