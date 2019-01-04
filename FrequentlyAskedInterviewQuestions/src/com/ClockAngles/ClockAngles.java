package com.ClockAngles;

public class ClockAngles {
	
	public double angles(int h1, int h2) 
	{
		double minute = (double)h2/5;
		
		double diff = Math.abs(minute - h1);
		return diff * 5 * 6; // one minute is 6 degrees and there are 5 minutes between 2 consecutive numbers
		
	}

	public static void main(String[] args) {
		
		ClockAngles a = new ClockAngles();
		System.out.println(a.angles(4,57));
	}

}
