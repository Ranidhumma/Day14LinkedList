package com.java;

public class LinkedList {

	Node head; // created head local variable

	/*
	 * addNodeStart - this method is created for adding data to linkedList
	 * 
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * 
	 * @param data - accepting data to put it in linkedList
	 */

	public void addNodeStart(int new_data) {
		/*
		 * Allocate the Node and Put in the data
		 * 
		 */
		Node new_node = new Node(new_data);

		/* making next of new Node as head */
		new_node.next = head;

		/* head is moving to point to new Node */
		head = new_node;
	}

	/*
	 * Here we are printing contents of linked list starting from the given node
	 */
	public void printLinkedList() {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			Node pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
		}
	}

	public void addNodeLast(int new_data) {
		Node new_node = new Node(new_data);
		/*
		 * If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			head = new Node(new_data);
			return;
		}
		/*
		 * new node is going to be the last node, so make next of it as null
		 */
		new_node.next = null;

		/* else traverse till the last node */
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;

		/* Change the next of last node */
		temp.next = new_node;
		return;

	}
}
