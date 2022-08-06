package inBuildExamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackInBuildOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();
		
		stack.push(34);
		stack.push(4);
		stack.push(3);
		stack.push(324);
		stack.push(111);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		Queue<Integer> que = new LinkedList<>();
		
		que.add(2);
		que.add(3);
		que.add(4);
		que.add(6);
		que.add(8);
		
		System.out.println(que.peek());
		System.out.println(que.remove());
		System.out.println(que.remove());
		
		
		Deque<Integer> deq = new ArrayDeque<>();
		deq.add(890);
		deq.addLast(78);
		deq.removeFirst();
		
		
		
	}

}
