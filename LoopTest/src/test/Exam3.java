package test;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		int sum=0;
		
		Scanner k = new Scanner(System.in);

		while(run) {
			System.out.println("********************");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("********************");
			System.out.print("선택 >>> ");
			balance = k.nextInt();
			if(balance==1) {
				System.out.print("예금액을 입력하시오 : ");
				int money=k.nextInt();
				sum+=money;
			}
			else if(balance==2) {
				System.out.print("출금액을 입력하시오 : ");
				int money=k.nextInt();
				sum-=money;
			}
			else if(balance==3) {
				System.out.printf("총 금액 : %d 원\n",sum);
			}
			else {
				run=false;
				System.out.println("프로그램 종료");
			}
			
		}
	}

}
