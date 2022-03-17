package linkedList;

public class LL {

	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size = 0;
	}
	
	public void insertFirst(int value) {
		
		Node newNode = new Node(value);
		
		newNode.next = head;
		head = newNode;
		
		if(tail == null) {
			tail = head;
		}
		
		size++;
	}
	
	public void insertLast(int val) {
		
		if(tail == null) {
			insertFirst(val);
			return;
		}
		
		Node newNode = new Node(val);
		tail.next = newNode;
		tail = newNode;
		
		size++;
	}
	
	public void insert(int val,int index) {
		
		if(size == 0) {
			insertFirst(val);
			return;
		}
		
		if(index == size) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		
		Node newNode = new Node(val,temp.next);
		
		temp.next = newNode;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	
	public int deleteLast() {
		
		if(size<=1) {
			deleteFirst();		
		}
		
		Node secondLastNode = get(size-2);
		int val = tail.value;
		secondLastNode.next = null;
		return val;
	}
	
	public int delete(int index) { 
		if(index == 0) {
			deleteFirst();
		}
		
		if(index == size - 1) {
			deleteLast();
		}
		
		Node prev = get(index-1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		return val;
	}
	
	public Node get(int nodeToReturnIndex) {
		// TODO Auto-generated method stub
		Node temp = head;
		int increment = 0;
		while(temp != null) {
			if(increment == nodeToReturnIndex) {
				return temp;
			}
			temp = temp.next;
			increment++;
		}
		
		return null;
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
	
	public void display() {
		
		Node temp = head;
	
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		
		System.out.println("END");
	}

	public class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
