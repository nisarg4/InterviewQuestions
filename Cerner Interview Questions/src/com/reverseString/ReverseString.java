package com.reverseString;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseString {
	
	String reverse(String sentence){
		String arr[] = sentence.split(" ");
		String result="";
		for(int i = arr.length-1; i >= 0; i--){
			result += arr[i]+" ";
		}
		return result;
	}
	String reverseWords(String sentence)
	{
		Stack<Character> stack = new Stack<Character>();
		String result = "";
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) != ' ')
				stack.push(sentence.charAt(i));
			else{
				while (!stack.isEmpty()){
					result += stack.pop();
				}
				result+=' ';
			}
			
		}
		while(!stack.isEmpty())
		{
			result += stack.pop();
		}
		return result;
	}
	String second(String sentence){
		String arr[] = sentence.split(" ");
		return arr[arr.length - 2];
	}
	String removeVowels(String sentence)
	{
		Character vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		List<Character> list = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(sentence);
		for(int i = 0 ; i < sb.length(); i++)
		{
			if(list.contains(sb.charAt(i)))
			{
				sb.replace(i,i+1,"");
				i--;
			}
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		String sentence = "The quick brown fox jumped over the lazy dog";
		ReverseString ob = new ReverseString();
		System.out.println(ob.reverse(sentence));
		System.out.println(ob.reverseWords(sentence));
		System.out.println(ob.second(sentence));
		System.out.println(ob.removeVowels(sentence));
	}

}
