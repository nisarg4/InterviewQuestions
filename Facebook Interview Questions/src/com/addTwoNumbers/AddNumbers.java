package com.addTwoNumbers;

public class AddNumbers {
	
	Node add(Node n1, Node n2) 
	{
		Node c1 = n1;
		Node c2 = n2;
		
		Node sentinel = new Node(0);
		Node d = sentinel;
		int carry = 0;
		while(c1 != null || c2!= null) 
		{
			int sum = carry;
			if(c1 != null) 
			{ 
				sum += c1.data;
				c1 = c1.next;
			}
			if(c2 != null) 
			{
				sum += c2.data;
				c2 = c2.next;
			}
			
			d.next = new Node(sum % 10);
			carry = sum/10;
			d = d.next;
		}
		if(carry > 0)
			d.next = new Node(carry);
		
		return sentinel.next;
	}
	
	void print(Node head) 
	{
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		
		AddNumbers a = new AddNumbers();
		
		Node head1 = new Node(2);
		head1.next = new Node(4);
		head1.next.next = new Node(3);
		
		Node head2 = new Node(5);
		head2.next = new Node(6);
		head2.next.next = new Node(9);
		
		Node result = a.add(head1, head2);
		
		a.print(result);

	}

}
