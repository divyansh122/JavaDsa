package classprogram;
import java.util.Stack;  
public class stack1 {
	 public static void main(String[] args) {
	        Stack stack = new Stack();
	        boolean result = stack.empty();
	        System.out.println("Is the stack empty? " + result);
	        stack.push(8);
	        stack.push(13);
	        stack.push(10);
	        stack.push(50);
	        System.out.println("Elements in Stack: " + stack);
	        result = stack.empty();
	        System.out.println("Is the stack empty?" + result);
	    }
	}

