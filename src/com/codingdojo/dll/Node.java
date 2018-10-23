package com.codingdojo.dll;

public class Node {
	public Integer value;
	public Node next;
	public Node previous;
	
	public Node(Integer val){
		this.value = val;
		this.next = null;
		this.previous = null;
	}
}
