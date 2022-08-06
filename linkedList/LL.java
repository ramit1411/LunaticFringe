package linkedList;

import linkedList.CycleQuestions.ListNode;

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
	
	private void bubbleSort() {
		bubbleSort(size-1,0);
	}
	
	private void bubbleSort(int row,int col) {
		if(row==0) {
			return;
		}
		
		if(col<row) {
			Node first = get(col);
			Node second = get(col+1);
			
			if(first.value>second.value) {
				//Swap
				
				if(first==head) {
					head = second;
					first.next = second.next;
					second.next = first;
				} else if (second == tail) {
					Node prev = get(col-1);
					prev.next = second;
					tail = first;
					first.next = null;
					second.next = tail;
				} else {
					Node prev = get(col-1);
					prev.next = second;
					first.next =second.next;
					second.next = first;
				}
			}
			
			bubbleSort(row,col+1);
				
		} else {
			bubbleSort(row-1,0);
		}
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
	
	public void insertR(int val,int index) {
		head = insertRec(val,index,head); 
	}
	
	private Node insertRec(int val, int index, Node node) {
		if(index == 0) {
			Node temp = new Node(val,node);
			size++;
			return temp;
		}
		
		node.next = insertRec(val,--index,node.next);
		
		return node;
	}

	private class Node {
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
	
	//Questions
	
	public void duplicates() {
		
		Node node = head;
		
		while(node.next != null) {
			if(node.value == node.next.value) {
				node.next = node.next.next;
				size--;
			}else {
				node = node.next;
			}
		}
		
		tail = node;
		tail.next = null;
	}
	
	
	public static LL merge(LL first, LL second) {
		
		Node f = first.head;
		Node s = second.head;
		
		LL ans = new LL();
		
		while(f!=null && s!=null) {
			if(f.value < s.value) {
				ans.insertLast(f.value);
				f = f.next;
			} else {
				ans.insertLast(s.value);
				s=s.next;
			}
		}
		
		while(f!=null) {
			ans.insertLast(f.value);
			f=f.next;
		}
		
		while(s!=null) {
			ans.insertLast(s.value);
			s=s.next;
		}
		
		return ans;
	}
	
	private void reverse(Node node) {
		if(node == tail) {
			head = tail;
			return;
		}
		reverse(node.next);
		tail.next = node;
		tail = node;
		tail.next = null;
	}
	
	//Google,amazon,apple and other faangs
//	https://leetcode.com/problems/reverse-linked-list/
	public void reverse() {
		if(size<2) {
			return;
		}
		
		Node prev = null;
		Node present = head;
		Node next = present.next;
		
		while(present != null) {
			present.next = prev;
			prev=present;
			present = next;
			if(next!=null) {
				next = next.next;
			}
		}
		
		head = prev;
	}
	
	
	//Google,amazon,apple and other faangs
//	https://leetcode.com/problems/reverse-linked-list-ii/
	public Node reverseBetween(Node head,int left,int right) {
		if(left==right) {
			return head;
		}
		
		
		Node prev = null;
		Node curr = head;		
		
		for(int i= 0;curr!= null && i<left-1;i++) {
			prev = curr;
			curr = curr.next;
		}
		
		Node last = prev;
		Node newEnd = curr;
		
		//Reverse btwn left & right
		
		
		Node next = curr.next;
		for(int i = 0;curr != null && i<right-left+1;i++) {
			curr.next = prev;
			prev=curr;
			curr = next;
			if(next!=null) {
				next = next.next;
			}
		}
		
		if(last!=null) {
			last.next = prev;
		} else {
			head = prev;
		}
		
		newEnd.next = curr;
		return head;
	}
	
//https://leetcode.com/problems/palindrome-linked-list/
	//Google,Amazon, Faang interview questions
	
	public boolean isPalindrome(Node head) {
        return true;	
        
    }
	
//https://leetcode.com/problems/reorder-list/
	//Google,fb
	
	public void reorderList(ListNode head) {
	      if(head==null || head.next == null) {
	    	  return;
	      }
	      
	      Node mid = middleNode(head);
	      ListNode hs = reverseList(mid);
	      
	      ListNode hf = head;
	      
	      while(hf!=null && hs!=null) {
	    	  Node temp = hf.next;
	    	  hf.next = hs;
	    	  hf= temp;
	    	  
	    	  temp = hs.next;
	    	  hs.next = hf;
	    	  hs.temp;
	      }
	      
	      //Next of tail to null
	      if(hf!=null) {
	    	  hf.next = null;
	      }
    }
	
	//https://leetcode.com/problems/reverse-nodes-in-k-group/
	// FAANGM	
	//This is also reversing the <k end items -> modify it accordingly
	 public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 && head == null) {
        	return head;
        }
        
        Node prev = null;
		Node curr = head;
		
        while(true) {
    		
    		Node last = prev;
    		Node newEnd = curr;
    		
    		Node next = curr.next;
    		for(int i = 0;curr != null && i<k;i++) {
    			curr.next = prev;
    			prev=curr;
    			curr = next;
    			if(next!=null) {
    				next = next.next;
    			}
    		}
    		
    		if(last!=null) {
    			last.next = prev;
    		} else {
    			head = prev;
    		}
    		
    		newEnd.next = curr;
    		
    		if(curr == null) {
    			break;
    		}
    		
    		prev = newEnd;
        }
        return head;
    }
	 
	 
	//https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
	 //google
	 public ListNode reverseKAlternativeGroup(ListNode head, int k) {
	        if(k<=1 && head == null) {
	        	return head;
	        }
	        
	        Node prev = null;
			Node curr = head;
			
	        while(true) {
	    		
	    		Node last = prev;
	    		Node newEnd = curr;
	    		
	    		Node next = curr.next;
	    		for(int i = 0;curr != null && i<k;i++) {
	    			curr.next = prev;
	    			prev=curr;
	    			curr = next;
	    			if(next!=null) {
	    				next = next.next;
	    			}
	    		}
	    		
	    		if(last!=null) {
	    			last.next = prev;
	    		} else {
	    			head = prev;
	    		}
	    		
	    		newEnd.next = curr;
	    		
	    		//skip the k nodes
	    		
	    		for(int i=0;current != null && i<k;i++) {
	    			prev = current;
	    			current = current.next;
	    		}
	        }
	        return head;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LL list = new LL();
//		
//		list.insertFirst(1);
//		list.insertFirst(1);
//		list.insertFirst(1);
//		list.insertFirst(2);
//		list.insertFirst(3);
//		list.insertFirst(4);
//		list.insertFirst(4);
//		
//		list.display();
//		
//		list.duplicates();
//		list.display();
		
		
//		LL first = new LL();
//		LL second = new LL();
//		
//		
//		first.insertLast(1);
//		first.insertLast(4);
//		first.insertLast(7);
//		first.insertLast(9);
//		first.display();
//		
//		second.insertLast(1);
//		second.insertLast(2);
//		second.insertLast(3);
//		second.insertLast(5);
//		second.insertLast(8);
//		second.insertLast(10);
//		second.display();
//		
//		
//		LL merge = new LL();
//		merge = merge(first,second);
//		merge.display();
//		
		
		LL listNew = new LL();
		
		//for(int i = 7 ; i>0;i++) {
			listNew.insertLast(7);
		//}
		
		listNew.display();
//		listNew.bubbleSort();
//		listNew.display();

	}

}
