package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("����1�� �Է��Ͻÿ� : ");
		int num1 = k.nextInt();
		System.out.print("����2�� �Է��Ͻÿ� : ");
		int num2 = k.nextInt();
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
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
