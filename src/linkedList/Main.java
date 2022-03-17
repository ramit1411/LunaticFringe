package linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LL list = new LL();
//		
//		list.insertFirst(1);
//		list.insertFirst(2);
//		list.insertFirst(3);
//		list.insertFirst(4);
//		list.insert(123, 2);
//		list.insertLast(99);
//		list.display();
//		
//		list.deleteFirst();
//		list.display();
//		list.deleteLast();
//		list.display();
//		list.delete(2);
//		list.display();
//		list.findValue(123);
//		list.display();
		
		
		
//		DLL list = new DLL();
//		
//		list.insertFirst(1);
//		list.insertFirst(2);
//		list.insertFirst(3);
//		list.insertFirst(4);
//		list.display();
//		list.insertLast(88);
//		list.display();
//		list.insertAfterValue(88, 55);
//		list.display();
		
		
		CLL list = new CLL();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.display();
		list.delete(3);
		list.display();
	}

}
