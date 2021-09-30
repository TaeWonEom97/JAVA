package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("사과");
		stack.push("배");
		stack.push("바나나");
		stack.push("감");
		System.out.println(stack);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
