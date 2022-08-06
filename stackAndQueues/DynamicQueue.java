package stackAndQueues;

public class DynamicQueue extends CircularQueue{

	public DynamicQueue() {
		super();
	}
	
	public DynamicQueue(int size) {
		super(size);
	}
	
	@Override
	public boolean insert(int item) {
		if(this.isFull()) {
			//Double the size array
			int[] temp = new int[data.length*2];
			
			for(int i = 0;i< data.length; i++) {
				temp[i] = data[(front+i)% data.length];
			}
			front = 0 ;
			end = data.length;
			data = temp;
		}
		
		return super.insert(item);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DynamicQueue queue = new DynamicQueue(5);
		queue.insert(3);
		queue.insert(6);
		queue.insert(5);
		queue.insert(33);
		queue.insert(1);
		queue.insert(3);
		queue.insert(6);
		queue.insert(5);
		queue.insert(33);
		queue.insert(1);
		queue.insert(3);
		queue.insert(6);
		queue.insert(5);
		queue.insert(33);
		queue.insert(1);
		queue.insert(3);
		queue.insert(6);
		queue.insert(5);
		queue.insert(33);
		queue.insert(1);
		
		
		queue.display();
		System.out.println();
		System.out.println(queue.remove());
		
		queue.insert(133);
		
		queue.display();
		
		

	}

}
