package com.bridgelab;

public class LinkedList {
	Node head;

	void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;

			}
			currentNode.next = node;
		}
	}

	// adding with to first node with 56,30,70
	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insert(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0) {
			addFirst(data);
		} else {
			Node currentPosition = head;
			for (int i = 0; i < index - 1; i++) {
				currentPosition = currentPosition.next;
			}
			    node.next=currentPosition.next;
				currentPosition.next = node;

			
		}
	}

	void display() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);

	}

}
