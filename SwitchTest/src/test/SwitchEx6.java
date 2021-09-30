package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하시오. :");
		int a = k.nextInt();
		int b = (int) ((Math.random() * 3) + 1);

		switch (a) {
		case 1:
			if (b == 1) {
				System.out.println(b);
				System.out.println("비겼습니다.");
			} else if (b == 2) {
				System.out.println(b);
				System.out.println("졌습니다.");
			} else {
				System.out.println(b);
				System.out.println("이겼습니다.");
			}
			break;
			
		case 2:
			if (b == 1) {
				System.out.println(b);

				System.out.println("이겼습니다.");
			} else if (b == 2) {
				System.out.println(b);

				System.out.println("비겼습니다.");
			} else {
				System.out.println(b);

				System.out.println("졌습니다.");
			}
			break;
			
		default:
			if (b == 1) {
				System.out.println(b);

				System.out.println("졌습니다.");
			} else if (b == 2) {
				System.out.println(b);

				System.out.println("이겼습니다.");
			} else {
				System.out.println(b);

				System.out.println("비겼습니다.");
			}
		}
	}

}
