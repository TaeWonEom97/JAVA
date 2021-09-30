package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("���");
		stack.push("��");
		stack.push("�ٳ���");
		stack.push("��");
		System.out.println(stack);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
