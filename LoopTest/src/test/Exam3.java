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
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("********************");
			System.out.print("���� >>> ");
			balance = k.nextInt();
			if(balance==1) {
				System.out.print("���ݾ��� �Է��Ͻÿ� : ");
				int money=k.nextInt();
				sum+=money;
			}
			else if(balance==2) {
				System.out.print("��ݾ��� �Է��Ͻÿ� : ");
				int money=k.nextInt();
				sum-=money;
			}
			else if(balance==3) {
				System.out.printf("�� �ݾ� : %d ��\n",sum);
			}
			else {
				run=false;
				System.out.println("���α׷� ����");
			}
			
		}
	}

}
