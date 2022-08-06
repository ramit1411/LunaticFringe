package stackAndQueues;

public class CustomStack {

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int ptr = -1;
	
	public CustomStack(int size) {
		this.data = new int[size];
	}
	
	public CustomStack() {
		this(DEFAULT_SIZE);
	}
	
	public boolean push(int item) {
		
		if(isFull()) {
			System.out.println("Stack is Full!!");
			return false;
		}
		
		ptr++;
		data[ptr] = item;
		return true;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Cannot pop from an empty Stack");
		}
		
//		int removed = data[ptr];
//		ptr--;
//		return removed;
		
		return data[ptr--];
	}
	
	public int peek() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Cannot pop from an empty Stack");
		}
		
		return data[ptr];

	}
	
	public boolean isFull() {
		return ptr == data.length - 1; //last index
	}
	
	private boolean isEmpty() {
		return ptr == -1; 
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CustomStack stack = new CustomStack();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(27);
		stack.push(9);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
