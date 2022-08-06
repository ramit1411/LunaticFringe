package linkedList;

public class CycleQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	
	
	//Amazon & Microsoft
    public boolean hasCycle(ListNode head) {
        
        if(head==null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!= null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	
        	if(fast==slow) {
        		return true;
        	}
        }
        
        return false;
    }
    
    
    public int LengthOfCycle(ListNode head) {
        
    	int length = 0;
        if(head==null || head.next == null) {
            return length;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!= null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	
        	if(fast==slow) {
        		ListNode temp = slow;
        		
        		do {
        			temp = temp.next;
        			length++;
        		} while(temp != slow);
        		
        		return length;
        	}
        }
        
        return length;
    }
	
//    https://leetcode.com/problems/linked-list-cycle-ii/submissions/
    public ListNode SendLoopStartingNodeBack(ListNode head) {
        
    	int length = 0;
        if(head==null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!= null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	
        	if(fast==slow) {
        		ListNode temp = slow;
        		
        		do {
        			temp = temp.next;
        			length++;
        		} while(temp != slow);
        	}
        }
        
        if(length>0) {
        	
        	ListNode first = head;
            ListNode second = head;
            
            while(length>0) {
            	second = second.next;
            	length--;
            }
            
            while(first != second) {
            	first = first.next;
            	second = second.next;
            }
            return first;
        }
        return null;
    }
    
    //Google
    //https://leetcode.com/problems/happy-number/
    
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = sumReturn(slow);
            fast = sumReturn(sumReturn(fast));
            
        }while(slow!=fast);
        
        if(slow == 1) {
            return true;
        }
        
        return false;
    }
    
    static int sumReturn(int n) {
        int sum = 0;
        while(n>0) {
            int k = (n%10);
            sum += (k*k);
            n = n/10;
        }
        return sum;
    }
    
    
    
	 // Definition for singly-linked list.
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	         val = x;
	          next = null;
	      }
	 }
	 
}
