package com.bridgelab;

public class Main {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(56);
		ll.add(30);
		ll.add(70);
	    ll.display();
	    System.out.println("after deletion in first position");
	    ll.deleteFirst();
	    ll.display();

	}

}
