package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		Scanner k = new Scanner(System.in);
		int user=0;
		do {
			System.out.print("숫자를 입력하시오. : ");
			user = k.nextInt();
			
			if(user<a) {
				System.out.println("더 큰 수를 입력하시오");
			}else if(user>a){
				System.out.println("더 작은 수를 입력하시오");
			}
		}while(user!=a);
		System.out.println("숫자가 일치합니다.");
	}

}
