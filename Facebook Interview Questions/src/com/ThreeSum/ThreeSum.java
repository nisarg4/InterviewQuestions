package com.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums,int k) 
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = 0; i < n - 2; i++) 
		{
//			if(i == 0 || (i > 0 && nums[i] != nums[i-1])) 
//		 	{
				int lo = i + i, hi = n-1, sum = k - nums[i];
				while(lo < hi)
				{
					if(nums[lo] + nums[hi] == sum) 
					{
						result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
						while(lo < hi && nums[lo] == nums[lo+1]) lo++; // avoid duplicates
						while(lo < hi && nums[hi] == nums[hi-1]) hi--; // avoid duplicates
						
						lo++;
						hi--;
					}
					else if(nums[lo] + nums[hi] < sum) lo++;
					else hi--;
				}
//			}
		}
		return result;
	}
	public static void main(String args[]) 
	{
		ThreeSum t = new ThreeSum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int k = 0;
		System.out.println(t.threeSum(nums, k));
	}

}
