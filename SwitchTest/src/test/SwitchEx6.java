package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �Է��Ͻÿ�. :");
		int a = k.nextInt();
		int b = (int) ((Math.random() * 3) + 1);

		switch (a) {
		case 1:
			if (b == 1) {
				System.out.println(b);
				System.out.println("�����ϴ�.");
			} else if (b == 2) {
				System.out.println(b);
				System.out.println("�����ϴ�.");
			} else {
				System.out.println(b);
				System.out.println("�̰���ϴ�.");
			}
			break;
			
		case 2:
			if (b == 1) {
				System.out.println(b);

				System.out.println("�̰���ϴ�.");
			} else if (b == 2) {
				System.out.println(b);

				System.out.println("�����ϴ�.");
			} else {
				System.out.println(b);

				System.out.println("�����ϴ�.");
			}
			break;
			
		default:
			if (b == 1) {
				System.out.println(b);

				System.out.println("�����ϴ�.");
			} else if (b == 2) {
				System.out.println(b);

				System.out.println("�̰���ϴ�.");
			} else {
				System.out.println(b);

				System.out.println("�����ϴ�.");
			}
		}
	}

}
