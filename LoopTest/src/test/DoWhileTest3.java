package test;

import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		Scanner k = new Scanner(System.in);
		int user=0;
		do {
			System.out.print("���ڸ� �Է��Ͻÿ�. : ");
			user = k.nextInt();
			
			if(user<a) {
				System.out.println("�� ū ���� �Է��Ͻÿ�");
			}else if(user>a){
				System.out.println("�� ���� ���� �Է��Ͻÿ�");
			}
		}while(user!=a);
		System.out.println("���ڰ� ��ġ�մϴ�.");
	}

}
