package stackAndQueues;

import java.util.Stack;

public class BalancedParanthesis {
	
	static boolean areBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		
		
		for(int i = 0; i<expression.length();i++) {
			char exp = expression.charAt(i);
			
			if(exp == '{' || exp == '(' || exp == '[') {
				stack.push(exp);
			} else {
				char top = stack.pop();
				if(exp == '}' && top != '{') {
					return false;	
				} else if(exp == ']' && top != '[') {
					return false;
				} else if(exp == ')' && top != '(') {
					return false;
				}
			}
		}
		
		if(stack.empty()) {
			return true;
		}
		
		return false;
	}
	
    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}}}}])";
 
        // Function call
        if (areBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
