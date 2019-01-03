package com.reverseLinkedList;

public class ReverseLinkedList {
	
	Node reverse(Node head) 
	{
		Node prev = null;
		Node next = null;
		Node curr = head;
		while(curr != null) 
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	void printNode(Node head) 
	{
		while(head != null) 
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		
		ReverseLinkedList r = new ReverseLinkedList();
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		System.out.println("current list:");
		
		r.printNode(head);
		
		Node n = r.reverse(head);
		
		System.out.println("reversed list");
		
		r.printNode(n);
		
		

	}

}
