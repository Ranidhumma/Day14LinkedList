package com.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome!!");
		LinkedList list = new LinkedList();

		list.addNodeLast(56);
		list.addNodeLast(30);
		list.addNodeLast(70);

		// list.deleteNodeEnd();
		list.printLinkedList();
		System.out.println();

		int Key_find = 30;
		if (list.search(list.head, Key_find))
			System.out.println(Key_find + " is found");
		else
			System.out.println(Key_find + " is not found");

		list.insertMidAnywhere(list.head.next, 40);
		list.printLinkedList();
	}
}
