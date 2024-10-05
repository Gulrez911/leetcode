package com.gul.leetcode.linkedlist;

public class AddToNumber {
//	practice linkedlist
//	https://docs.google.com/document/d/1ysYfkEEdeCRf1j8nGRvLCuPpEtN58Z51iMzgXB7pYIE/edit
	Node head;
	private int size;

	AddToNumber() {
		size = 0;
	}

	class Node {
		int data;
		Node next = null;

		Node() {
		}

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;

		}

	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}

		lastNode.next = newNode;
	}

//	How to insert in the middle of a Linked List (at a specified index ‘i’) ?
	public void addInMiddle(int index, int data) {
		if (index > size || index < 0) {
			System.out.println("Invalid Index value");
			return;
		}
		size++;

		Node newNode = new Node(data);
		if (head == null || index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node currNode = head;
		for (int i = 1; i < size; i++) {
			if (i == index) {
				Node nextNode = currNode.next;
				currNode.next = newNode;
				newNode.next = nextNode;
				break;
			}
			currNode = currNode.next;
		}
	}

	public void printList() {
		Node currNode = head;

		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("null");
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		head = this.head.next;
		size--;
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		size--;
		if (head.next == null) {
			head = null;
			return;
		}

		Node currNode = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			currNode = currNode.next;
			lastNode = lastNode.next;
		}

		currNode.next = null;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		AddToNumber list = new AddToNumber();
		list.addLast(4);
		list.addLast(7);
		list.addLast(23);
		list.printList();

		list.addFirst(9);
		list.printList();
		System.out.println(list.getSize());

		list.removeFirst();

		list.printList();

		list.removeLast();
		list.printList();

	}
}
