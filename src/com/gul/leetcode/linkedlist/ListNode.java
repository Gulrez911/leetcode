package com.gul.leetcode.linkedlist;

public class ListNode {
	Node head;
//	private int size;

//	ListNode() {
//		size = 0;
//	}

	static class Node {
		int data;
		Node next = null;

		Node() {
		}

		Node(int data) {
			this.data = data;
			this.next = null;
//			size++;

		}

	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
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

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		ListNode list = new ListNode();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

		// Print the LinkedList
		printList(list);
	}
}
