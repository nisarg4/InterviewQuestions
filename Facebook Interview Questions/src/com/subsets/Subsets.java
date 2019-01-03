package com.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	
	public List<List<Integer>> subset(int nums[])
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		
		for(int num : nums) 
		{
			int size = result.size();
			for(int i = 0; i < size; i++) 
			{
				List<Integer> subset = new ArrayList<>(result.get(i));
				subset.add(num);
				result.add(subset);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Subsets sub = new Subsets();
		
		int nums[] = {1,2,3};
		
		System.out.println(sub.subset(nums));
	}

}
