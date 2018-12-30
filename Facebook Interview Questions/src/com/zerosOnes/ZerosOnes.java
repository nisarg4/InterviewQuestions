package com.zerosOnes;

public class ZerosOnes {
	
	static Node rearragne(Node head) 
	{
		Node head_0 = new Node();
		Node head_1 = new Node();
		
		Node zeros = head_0;
		Node ones = head_1;
		
		
		while(head != null) 
		{
			if(head.data == 0) 
			{
				head_0.next = new Node(0);
				head_0 = head_0.next;
			}
			else if(head.data == 1) 
			{
				head_1.next = new Node(1);
				head_1 = head_1.next;
			}
			head = head.next;
		}
		head_0.next = ones.next;
		return zeros.next;
	}
	static void print(Node head) 
	{
		while(head != null) 
		{
			System.out.print(head.data + "  ");
			head = head.next;
		}
	}
	
	//Driver program
	public static void main(String args[]) 
	{
		//011010
		Node head = new Node(0);
		head.next = new Node(1);
		head.next.next = new Node(1);
		head.next.next.next = new Node(0);
		head.next.next.next.next = new Node(1);
		head.next.next.next.next.next = new Node(0);
		
		System.out.println("Before rearranging");
		print(head);
		
		System.out.println();
		System.out.println("After rearranging");
		print(rearragne(head));
	}

}
