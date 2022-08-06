package linkedList;

import linkedList.LL.Node;

public class DLL {

	private Node head;
	private Node tail;
	private int size;
	
	public DLL() {
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node newNode = new Node(val);
		
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null) {
			head.prev = newNode;
		}
		
		head = newNode;
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		node.next = null;
		
		if(head == null) {
			node.prev = null;
			head = node;
			return;
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = node;
		node.prev = last;
		
	}
	
	public Node findValue(int valueToFind) {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null) {
			if(temp.value == valueToFind) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public void insertAfterValue(int valueAfterWhichInsert, int valueToBeInserted) {
		Node p = findValue(valueAfterWhichInsert);
		
		if(p == null) {
			System.out.println("Value does not exist !");
			return;
		}
		
		Node node = new Node(valueToBeInserted);
		node.next = p.next;
		node.prev = p;
		p.next = node;
		
		if(node.next !=null) {
			node.next.prev = node;
		}
	}
	
	public void display() {
		
		Node temp = head;
		Node last = null;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			last = temp;
			temp = temp.next;
		}
		
		System.out.println("END");
		System.out.println("Print In Reverse : ");
		while(last != null) {
			System.out.print(last.value + " -> ");
			last = last.prev;
		}
		System.out.println("START");
	}

	
	private class Node {
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}

}
