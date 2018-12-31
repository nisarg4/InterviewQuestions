package com.validBST;

import java.util.Stack;

/*
 * We can perform it in two ways
 * 1. Recursively
 * 2. Using a Stack*/

public class ValidBST {
	
	//Method 1: Using recursion
	boolean isValid(TreeNode node) 
	{
		return isValid(node, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	boolean isValid(TreeNode root,long minValue, long maxValue) 
	{
		if(root == null)
			return true;
		if(root.val >= maxValue || root.val <= minValue)
			return false;
		
		return (isValid(root.left,minValue,root.val) && isValid(root.right,root.val,maxValue));
		
	}
	//Method 2: Using stack
	boolean isValidBST(TreeNode root) 
	{
		Stack <TreeNode> stack = new Stack<TreeNode>();
		TreeNode prev = null;
		while(root != null || !stack.isEmpty()) 
		{
			while(root != null) 
			{
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if(prev != null && root.val <= prev.val)
				return false;
			prev = root;
			root = root.right;
		}
		return true;
	}
	public static void main(String[] args) {
		
		
		ValidBST v = new ValidBST();
		
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		
		TreeNode root1 = new TreeNode(15);
		root1.left = new TreeNode(11);
		root1.right = new TreeNode(20);
		root1.left.left = new TreeNode(8);
		root1.left.right = new TreeNode(12);
		root1.right.left = new TreeNode(14); // if changed to any number x where 20 > x > 15, it will be a valid BST 
		root1.right.right = new TreeNode(21);
		
		System.out.println(v.isValid(root));//true;
		System.out.println(v.isValidBST(root));//true;
		
		System.out.println(v.isValid(root1));//false;
		System.out.println(v.isValidBST(root1));//false;
	}

}
