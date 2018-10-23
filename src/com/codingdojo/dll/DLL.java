package com.codingdojo.dll;

import java.util.ArrayList;
import java.lang.*;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	public void printValuesForward() {
		Node current = this.head;
		while(current !=null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	public void printValuesBackward() {
		Node current = this.tail;
		while(current !=this.head.previous) {
			System.out.println(current.value);
			current = current.previous;
		}
	}
	public void pop() {
		Node lastNode = this.tail;
		lastNode.previous.next = null;
	}
	public boolean contains(Integer val) {
		Node current = this.head;
		while(current !=null) {
			if(current.value == val) {
				System.out.println("true");
				return true;
			}
			current = current.next;
		}
		System.out.println("false");
		return false;
	}
	public void insertAt(Node newNode, int index) {
		Node current = this.head;
		int counter = 0;
		if(current == null) {
			System.out.println("There is no Node, please use push() first");
		}
		while(current.next !=null) {
			System.out.println("counter: "+counter+" current.value: "+current.value);
			if(counter == index) {
				newNode.next = current.next;
				newNode.previous = current;
				current.next.previous = newNode;
				current.next = newNode;
				return;
			}
			current = current.next;
			counter++;
			System.out.println("counter added: "+counter);
		}
		System.out.println("out loop");
		if(current.next == null) {
			if(counter == index) {
				current.next = newNode;
				current.next.next = null;
				current.next.previous = current;
				this.tail = current.next;
			}
			System.out.println("out of index");
		}
	}
	public void removeAt(int index) {
		Node current = this.head;
		int counter = 0;
		if(current == null) {
			System.out.println("There is no Node, please use push() first");
		}
		if(index == 0) {
			this.head = current.next;
			this.tail = current.next;
			return;
		}
		
		while(current.next !=null) {
			System.out.println("counter: "+counter+" current.value: "+current.value);
			if(counter == index) {
				current.previous.next = current.next;
				current.next.previous = current.previous;
				return;
			}
			current = current.next;
			counter++;
			System.out.println("counter added: "+counter);
		}
		System.out.println("out loop");
		if(current.next == null) {
			if(counter == index) {
				current.previous.next = null;
				this.tail = current.previous;
			}
			System.out.println("out of index");
		}
	}
	public boolean isPalindrome() {
		Node current = this.head;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(current !=null) {
			arr.add(current.value);
			current = current.next;
		}
		System.out.println(arr);
		if(arr.size()%2 != 0) {
			System.out.println("nop");
			return false;
		} else {
			int half = arr.size()/2-1;
//			System.out.println("arr half is: "+half);
			for (int i=0; i<half+1; i++) {
				if(arr.get(half-i) != arr.get(half+1+i)) {
					System.out.println("nop2");
					return false;
				}
			}
			System.out.println("oh yes");
			return true;
		}
	}

}







