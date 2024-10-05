package com.gul.math.linkedlist;

public class ListNode {
	// Working

	int data;
	ListNode next;
	ListNode head;

	ListNode() {
	}

	ListNode(int data) {
		this.data = data;
	}

	ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode temp = new ListNode(0);
		int carry = 0;
		ListNode head = temp;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				carry += l1.data;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.data;
				l2 = l2.next;
			}
			temp.next = new ListNode(carry % 10);
			temp = temp.next;
			carry = carry / 10;
		}
		if (carry == 1) {
			temp.next = new ListNode(1);
		}

		printList(head.next);
		return head.next;
	}

	public static ListNode insert(ListNode list, int data) {
//			Node head = list;
		ListNode new_node = new ListNode(data);
		// If the Linked List is empty.
		// the make the new node as head
		if (list.head == null) {
			list.head = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			ListNode last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	public static void reverseList(ListNode list) {
		if (list.head == null || list.head.next == null) {
			return;
		}

		ListNode prevNode = list.head;
		ListNode currNode = list.head.next;
		while (currNode != null) {
			ListNode nextNode = currNode.next;
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

	public static void printList(ListNode list) {
		ListNode currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

}
