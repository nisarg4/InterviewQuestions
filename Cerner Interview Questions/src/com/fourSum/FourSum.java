package com.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static List<List<Integer>> fourDigits(int []nums, int target)
	{
	//{-2,-1,0,0,1,2}
			ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
			int len = nums.length;
			if(len < 4 || nums == null)
				return res;
			Arrays.sort(nums);
			int max = nums[len-1];
			if(4 * nums[0] > target || 4 * max < target)
				return res;

			int i,z;
			for(i = 0; i < len; i++)
			{
				z = nums[i];
				if(z > 0 && nums[i-1] == z)
					continue;
				if(z + 3 * max < target)
					continue;
				if(4 * z > target)
					continue;
				if(z == target)
				{
					if(i+3 < len && nums[i+3] == z)
					{
						res.add(Arrays.asList(z,z,z,z));
					}
					break;
					
				}
				threeDigits(nums,target - z, i+1, len-1, res, z);
					
			}
			return res;
		}
		public static void threeDigits(int []nums, int target, int lo, int hi, ArrayList<List<Integer>> res, int z1)
		{
			if(3 * nums[lo] > target || 3 * hi < target)
				return;

			int i,z;
			for(i = lo; i < hi; i++)
			{
				z = nums[i];
				if(z > lo && nums[hi] == z)
					continue;
				if(z + 2 * nums[hi] < target)
					continue;
				if(3 * z > target)
					continue;
				if(z == target)
				{
					if(i+1 < hi && nums[i+2] == z)
					{
						res.add(Arrays.asList(z1,z,z,z));
					}
					break;
					
				}
				twoDigits(nums,target - z, i+1, hi, res, z1,z);
					
			}
			return;
		}
		public static void twoDigits(int []nums, int target, int lo, int hi, ArrayList<List<Integer>> res, int z1, int z2)
		{
			if(lo + 1 >= hi)
				return;
			int i = lo;
			int j = hi,x;
			int sum;
			while(i < j)
			{
				sum = nums[i] + nums[j];
				if(sum == target)
				{
					res.add(Arrays.asList(z1,z2,nums[i],nums[j]));
				
					x = nums[i];
					while(++i  < j && x == nums[i])
						;
					x = nums[j];
					while(i  < --j && x == nums[j])
						;
				}
				if(sum < target)
					i++;
				if(sum > target)
					j--;
			}
			return;
		}
		public static void main(String args[])
		{
			int arr[] = {1,0,-1,0,-2,2}; //{-2,-1,0,0,1,2}
			System.out.println(fourDigits(arr,0));
		}
}
