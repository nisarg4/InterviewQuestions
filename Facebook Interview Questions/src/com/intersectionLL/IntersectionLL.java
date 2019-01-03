package com.intersectionLL;

public class IntersectionLL {
	
	static Node headA, headB;
	
	Node getIntersection (Node headA, Node headB) 
	{
		Node a = headA;
		Node b = headB;
		while(a != b) 
		{
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;
	}

}
