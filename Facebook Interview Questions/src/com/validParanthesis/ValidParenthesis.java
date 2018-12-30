package com.validParanthesis;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ValidParenthesis {
	
	boolean isValid(String s) 
	{
		if(s == null || s.length() == 0)
			return true;
		
		Deque<Character> stack = new ArrayDeque<Character>();
		for(char c : s.toCharArray()) 
		{
			if(c == '{')
				stack.addFirst('}');
			else if(c == '(')
				stack.addFirst(')');
			else if(c == '[')
				stack .addFirst(']');
			else if(stack.isEmpty() || c != stack.removeFirst())
				return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		ValidParenthesis v = new ValidParenthesis();
		List<String> list = new ArrayList<String>();
		
		list.add("()"); // true
		list.add("()[]{}"); // true
		list.add("(]");  //false
		list.add("([)]"); //false
		list.add("{[]}"); //true
		list.add(""); //true
		
		for(String s : list) 
		{
			System.out.println(s+": "+v.isValid(s));
		}
	
	}

}
