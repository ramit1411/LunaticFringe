package stackAndQueues;

public class MidElementStack {
	//https://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/
	
	class DLL {
		DLL prev;
		int data;
		DLL next;
		DLL(int d) {
			data = d;
		}	
	}
	
	class myStack {
		DLL head;
		DLL mid;
		int count;
	}
	
	 myStack createMyStack() {
        myStack ms = new myStack();
        ms.count = 0;
        return ms;
    }
	 
	void push(myStack ms,int x) {
		DLL node = new DLL(x);
		
		node.next = ms.head;
		
		ms.count += 1;
		
		if(ms.count == 1) {
			ms.mid = node;
		} else {
			ms.head.prev = node;
			
			if((ms.count%2)!=0) {
				ms.mid = ms.mid.prev;
				
			}
		}
		
		ms.head = node;	
	}
	
	int pop(myStack ms) {
		if(ms.count == 0) {
			System.out.println("Stack is EMpty");
			return -1;
		}
		
		DLL head = ms.head;
		int item  = head.data;
		ms.head = head.next;
		
		ms.count -= 1;
		
		if(ms.count%2 == 0) {
			ms.mid = ms.mid.next;
		}
		
		return item;
	}
	
	   int findMiddle(myStack ms)
	    {
	        if (ms.count == 0) {
	            System.out.println("Stack is empty now");
	            return -1;
	        }
	        return ms.mid.data;
	    }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MidElementStack ob = new MidElementStack();
		
		 myStack ms = ob.createMyStack();
	        ob.push(ms, 11);
	        ob.push(ms, 22);
	        ob.push(ms, 33);
	        ob.push(ms, 44);
	        ob.push(ms, 55);
	        ob.push(ms, 66);
	        ob.push(ms, 77);
	 
	        System.out.println("Item popped is " + ob.pop(ms));
	        System.out.println("Item popped is " + ob.pop(ms));
	        System.out.println("Middle Element is "
	                           + ob.findMiddle(ms));
	}

}
