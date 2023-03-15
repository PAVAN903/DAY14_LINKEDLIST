package com.bridgelab;

public class LinkedList {
	Node head;
	void add(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}else {
			Node currentNode=head;
			while(currentNode.next !=null) {
				currentNode=currentNode.next;
			
			}
			currentNode.next=node;
			}
			}
	       void display() {
	    	Node node=head;
	    	while(node.next!=null) {
	    		System.out.println(node.data);
	    		node=node.next;
	    	}
	    	System.out.println(node.data);
	
		
	}

}
