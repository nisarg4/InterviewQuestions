package com.middleElement;

public class MiddleElement {
	
	int find_middle(ListNode head) 
	{
		ListNode slow = head;
		ListNode fast = head;
		if(head != null) 
		{
			while(fast!= null && fast.next != null) 
			{
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return slow.data;
	}
	void print(ListNode head) 
	{
		while(head != null) 
		{
			System.out.print(head.data);
			head = head.next;
			if(head!=null)
				System.out.print("->");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MiddleElement me = new MiddleElement();
		
		ListNode head = new ListNode(0);
		ListNode sentinel = head;
		for(int i = 1;i <= 5; i++) 
		{
			sentinel.next = new ListNode(i);
			sentinel = sentinel.next;
		}
		System.out.println("ListNode: ");
		me.print(head);
		System.out.println("Middle data");
		System.out.println(me.find_middle(head));
	}

}
