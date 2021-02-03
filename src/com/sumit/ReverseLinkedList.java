package com.sumit;


public class ReverseLinkedList {
	
	static Node head;
	
	static class Node
	{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		    next = null;	
		}
	}
	
	Node reverseLinkedList(Node node) 
	{
		
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		node = prev;
		return node;
	}
	
	void printLinkedList(Node node) 
	{
		while(node!=null) 
		{
			System.out.println(node.data + " ");
			node = node.next;
		}
		
	}
	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		reverseLinkedList.head = new Node(10);
		reverseLinkedList.head.next = new Node(20);
		reverseLinkedList.head.next.next = new Node(30);
		reverseLinkedList.head.next.next.next = new Node(40);
		
		System.out.println("Linked List Before Reversing Occurs");
		reverseLinkedList.printLinkedList(head);
		
		head = reverseLinkedList.reverseLinkedList(head);
		System.out.println("Linked List After Reversing Occurs");
		reverseLinkedList.printLinkedList(head);
		
	}

}
