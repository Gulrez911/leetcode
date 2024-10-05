package com.gul.math;

public class ListNode {

	public Node head;

	public static class Node {

		public int data;
		public Node next;

		Node() {

		}

		// Constructor
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static ListNode insert(ListNode list, int data) {
//		Node head = list;
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

	public static ListNode addTwoNumbers(ListNode li, ListNode li2) {
//		if (list.head == null || list.head.next == null || list2.head == null || list2.head.next == null) {
//			return;
//		}

		int total = 0;
		String a = "", b = "";
		ListNode list3 = new ListNode();

		Node currNode = li.head;

		Node currNode2 = li2.head;
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");
			a += String.valueOf(currNode.data);
			// Go to next node
			currNode = currNode.next;
		}
		while (currNode2 != null) {
			// Print the data at current node
			System.out.print(currNode2.data + " ");
			b += String.valueOf(currNode2.data);
			// Go to next node
			currNode2 = currNode2.next;
		}
		total = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(total);
		char y;
		for (int i = Integer.toString(total).length() - 1; i >= 0; i--) {
			y = Integer.toString(total).charAt(i);
			int temp = Integer.parseInt(String.valueOf(y));
			insert(list3, temp);
		}
		printList(list3);
		return list3;
	}

	public static void reverseList(ListNode list) {
		if (list.head == null || list.head.next == null) {
			return;
		}

		Node prevNode = list.head;
		Node currNode = list.head.next;
		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		list.head.next = null;
		list.head = prevNode;
		printList(list);
	}

	public static void main(String[] args) {
		/* Start with the empty list. */
		ListNode list = new ListNode();

		//
		// ******INSERTION******
		//

		// Insert the values
//		list = insert(list, 2);
//		list = insert(list, 4);
//		list = insert(list, 3);

		list = insert(list, 9);
		list = insert(list, 9);
		list = insert(list, 9);
		list = insert(list, 9);
		list = insert(list, 9);
		list = insert(list, 9);
		list = insert(list, 9);

		ListNode list2 = new ListNode();

		//
		// ******INSERTION******
		//

		// Insert the values
//		list2 = insert(list2, 5);
//		list2 = insert(list2, 6);
//		list2 = insert(list2, 4);

		list2 = insert(list2, 9);
		list2 = insert(list2, 9);
		list2 = insert(list2, 9);
		list2 = insert(list2, 9);

//		list = insert(list, 4);
//		list = insert(list, 5);
//		list = insert(list, 6);
//		list = insert(list, 7);
//		list = insert(list, 8);

		// Print the LinkedList
		System.out.println("1st: ");
		printList(list);
		System.out.println("2nd: ");
		printList(list2);
		System.out.println("reverse: ");
		reverseList(list);
		System.out.println("reverse2: ");
		reverseList(list2);
		addTwoNumbers(list, list2);

	}
}
