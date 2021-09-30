package test;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하시오");
		System.out.println("프로그램을 종료하려면 q를 입력하시오");
		
		Scanner k = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("> ");
			inputString = k.next();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println("프로그램종료");
	}

}
