package com.directions;

public class Directions {
	
	public static String getDirection(int x1, int y1, int x2, int y2)
	{
		if(x1 == x2 && y1 == y2)
			return "HERE";
		if(x1 > x2) // Everything in west now
		{
			if(y1 > y2)
				return "SW";
			else if(y1 < y2)
				return "NW";
			else
				return "W";
		}
		else if(x1 < x2) // everything east from here
		{
			if(y1 > y2)
				return "SE";
			else if(y1 < y2)
				return "NE";
			else
				return "E";
		}
		else if(x1 == x2)
		{
			if(y1 < y2)
				return "N";
			else
				return "S";
		}
		return "ERROR";
	}
	public static void main(String args[])
	{
		System.out.println(getDirection(2,7,3,-9));
	}

}
