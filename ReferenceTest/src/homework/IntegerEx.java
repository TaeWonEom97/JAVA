package homework;

import java.util.Scanner;

public class IntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�. : ");
		String input=sc.next();
		System.out.println(input+5);
		
		int num=Integer.parseInt(input);
		System.out.println(num+5);
	}

}
