package com.gul.leetcode.linkedlist.test;

public class ListNode {

	public Node head;

	public static class Node {

		public int data;
		public Node next;

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static ListNode insert(ListNode list, int data) {

		Node new_node = new Node(data);
		// If the Linked List is empty.
		// the make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	public static void printList(ListNode list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		/* Start with the empty list. */
		ListNode list = new ListNode();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);

		ListNode list2 = new ListNode();

		//
		// ******INSERTION******
		//

		// Insert the values
		list2 = insert(list2, 5);
		list2 = insert(list2, 6);
		list2 = insert(list2, 7);
//		list = insert(list, 4);
//		list = insert(list, 5);
//		list = insert(list, 6);
//		list = insert(list, 7);
//		list = insert(list, 8);

		// Print the LinkedList
//		System.out.println("1st: ");
		printList(list);
//		System.out.println("2nd: ");
		printList(list2);

	}
}
