package exam;

import java.util.Scanner;

public class NumMultiple {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("변수를 입력하시오 : ");
		int num=k.nextInt();
		int num2=((num/10)+1)*10;
		System.out.println(num2-num);
		System.out.println(10-(num%10));
		
	}

}
