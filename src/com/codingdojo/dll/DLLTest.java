package com.codingdojo.dll;

public class DLLTest {

	public static void main(String[] args) {
		DLL dll = new DLL();
//		Node n1 = new Node(10);
//		Node n2 = new Node(20);
//		Node n3 = new Node(50);
//		Node n4 = new Node(60);
//		Node n5 = new Node(80);
//		Node n6 = new Node(100);
		Node n1 = new Node(10);
		Node n2 = new Node(10);
		Node n3 = new Node(30);
		Node n4 = new Node(30);
		Node n5 = new Node(10);
		Node n6 = new Node(10);
		
//		Node n7 = new Node(5);
		
		dll.push(n1);
		dll.push(n2);
		dll.push(n3);
		dll.push(n4);
		dll.push(n5);
		dll.push(n6);
		
//		dll.printValuesForward();
//		dll.printValuesBackward();
//		dll.pop();
//		dll.contains(0);
//		dll.contains(10);
//		dll.contains(50);
//		dll.contains(100);
		
//		dll.insertAt(n7,0);
		
//		dll.removeAt(5);
		
		dll.isPalindrome();
		
//		dll.printValuesForward();


	}

}
