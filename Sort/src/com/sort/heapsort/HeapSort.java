package com.sort.heapsort;

import java.util.Arrays;

import com.sort.heapsort.HeapSort;

public class HeapSort {
	
	void heapsort(int arr[])
	{
		int n = arr.length;
		for(int i = n - 1; i >=0 ;i--) {
			heapify(arr,n,i);
		}
		for(int i = n-1; i >=0 ;i--) {
			
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr,i,0);
		}
	}
	void heapify(int arr[],int n, int i) 
	{
		int largest = i;
		int left = 2*i + 1;
		int right = 2*i + 2;
		
		if(left < n && arr[left] > arr[largest]) 
			largest = left;
		
		if(right < n && arr[right] > arr[largest]) 
			largest = right;
		
		if(largest != i)
		{
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr,n,largest);
		}
	}

	public static void main(String[] args) {
		
		HeapSort sort = new HeapSort();

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

		sort.heapsort(arr);

		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

}
