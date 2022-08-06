package stackAndQueues;

public class DynamicStack extends CustomStack {

	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int size) {
		super(size);
	}
	
	@Override
	public boolean push(int item) {
		if(this.isFull()) {
			//Double the size array
			int[] temp = new int[data.length*2];
			
			for(int i = 0;i< data.length; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
		}
		
		return super.push(item);
	}
	
	public static void main(String[] args) throws Exception {
		DynamicStack stack = new DynamicStack();
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(27);
		stack.push(9);
		stack.push(9);
		stack.push(9);
		stack.push(9);
		stack.push(9);
		
		stack.push(9);
		
		stack.push(9);
		stack.push(9);
		stack.push(9);
		
		stack.push(9);
		stack.push(9);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
	}
}
