package stackAndQueues;

public class GetMinInLessTimeComplexity {

	
	
	public class myStack {
		int[] data;
		int size;
		int min = 9999999;
		int ptr = -1;
		
		public myStack() {
			this.size = 10;
			this.data = new int[size];
		}
		
		public myStack(int size) {
			this.size = size;
			this.data = new int[size];
		}
	}
	
	
	static void push(myStack st,int val) {
		
		if(isFull(st)) {
			System.out.println("Stack Is Full");
		}
		
		if(st.ptr == -1) {
			st.data[++st.ptr] = val;
			st.min = val;
		} else {
			
			if(val > st.min) {
				st.data[++st.ptr] = val;
			} else {
				st.data[++st.ptr] = ((2*val) - st.min);
				st.min = val;
			}
		}
	}
	
	static int pop(myStack st) {
		
		if(isEmpty(st)) {
			System.out.println("Stack is EMpty");
		}
		
		if(st.data[st.ptr] < st.min) {
			st.min = 2*st.min - st.data[st.ptr];
		}
		return st.data[st.ptr--];
		
	}
	
	static int top(myStack st) {
		return st.data[st.ptr];
	}
	
	static int getMin(myStack st) {
		return st.min;
	}
	
	private static boolean isFull(myStack st) {
		return (st.ptr == st.data.length);
	}
	
	private static boolean isEmpty(myStack st) {
		return st.ptr == -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		myStack stc = new GetMinInLessTimeComplexity().new myStack(10);
		
		
		push(stc,5);
		System.out.println(getMin(stc));
		push(stc, 8);
		System.out.println(getMin(stc));
		push(stc, 4);
		System.out.println(getMin(stc));
		push(stc, 6);
		System.out.println(getMin(stc));
		push(stc, 1);
		System.out.println(getMin(stc));
		push(stc, 7);
		System.out.println(getMin(stc));
		pop(stc);
		System.out.println(getMin(stc));
		pop(stc);
		System.out.println(getMin(stc));
		pop(stc);
		System.out.println(getMin(stc));
		pop(stc);
		System.out.println(getMin(stc));
		pop(stc);
		pop(stc);
		
		
	}

}
