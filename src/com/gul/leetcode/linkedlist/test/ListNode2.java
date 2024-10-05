package com.gul.leetcode.linkedlist.test;

import com.gul.leetcode.linkedlist.test.LinkedList.Node;

public class ListNode2 {

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

	public static ListNode2 insert(ListNode2 list, int data) {

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

	public static void printList(ListNode2 list) {
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

	public static ListNode2 addTwoNumbers(ListNode2 list, ListNode2 list2) {
//		if (list.head == null || list.head.next == null || list2.head == null || list2.head.next == null) {
//			return;
//		}

		ListNode2 list3 = new ListNode2();

		Node currNode = list.head;

		Node currNode2 = list2.head;
		while (currNode != null || currNode2 != null) {
			Node new_node3 = new Node();
			if (currNode != null && currNode2 != null) {

				if (list3.head == null) {

					int new_node = currNode.data + currNode2.data;
					new_node3 = new Node(new_node);
					list3.head = new_node3;
				}

				else {
					// Else traverse till the last node
					// and insert the new_node there

					int new_node_val = currNode.data + currNode2.data;

					Node new_node = new Node(new_node_val);
					Node last = list3.head;
					while (last.next != null) {
						last = last.next;
					}
					last.next = new_node;

				}

			} else if (currNode != null) {

				if (list3.head == null) {

					int new_node = currNode.data;
					new_node3 = new Node(new_node);
					list3.head = new_node3;
				}

				else {

					int new_node_val = currNode.data;

					Node new_node = new Node(new_node_val);
					Node last = list3.head;
					while (last.next != null) {
						last = last.next;
					}
					last.next = new_node;

				}

			} else if (currNode2 != null) {

				if (list3.head == null) {

					int new_node = currNode2.data;
					new_node3 = new Node(new_node);
					list3.head = new_node3;
				}

				else {

					int new_node_val = currNode2.data;

					Node new_node = new Node(new_node_val);
					Node last = list3.head;
					while (last.next != null) {
						last = last.next;
					}
					last.next = new_node;

				}

			}

			// end
			if (currNode != null) {
				currNode = currNode.next;
			}
			if (currNode2 != null) {
				currNode2 = currNode2.next;
			}

		}
		printList(list3);
		return list3;
	}

	public static void reverseList(ListNode2 list) {
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
		ListNode2 list = new ListNode2();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert(list, 2);
		list = insert(list, 4);
		list = insert(list, 3);

		ListNode2 list2 = new ListNode2();

		//
		// ******INSERTION******
		//

		// Insert the values
		list2 = insert(list2, 5);
		list2 = insert(list2, 6);
		list2 = insert(list2, 4);
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
