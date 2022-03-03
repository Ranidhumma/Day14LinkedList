package com.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome!!");
		Node head = new Node(56);
		Node Second = new Node(30);
		Node Third = new Node(70);
		head.next = Second;
		Second.next = Third;
		Third.next = null;

		System.out.println(head.data + " " + Second.data + " " + Third.data);
	}
}
