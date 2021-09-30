package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("숫자1을 입력하시오 : ");
		int num1 = k.nextInt();
		System.out.print("숫자2을 입력하시오 : ");
		int num2 = k.nextInt();
		System.out.print("연산자를 입력하시오 : ");
		String operator = k.next();
		
		switch (operator) {
		case "+":
			System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			break;
		default:
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			break;
		}
	}

}
