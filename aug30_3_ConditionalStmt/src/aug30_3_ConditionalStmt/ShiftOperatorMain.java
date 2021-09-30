package aug30_3_ConditionalStmt;

import java.util.Scanner;

//24시간 : 1
//주차 : 2
//흡연실 : 4
//와이파이 : 8
//배달 : 16
public class ShiftOperatorMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("가치를 입력하시오. : ");
		int value = k.nextInt();

		if (value >= 16) {
			System.out.println("배달가능");
			value -= 16;
		}

		if (value >= 8) {
			System.out.println("와이파이 있음");
			value -= 8;
		}

		if (value >= 4) {
			System.out.println("흡연실 존재");
			value -= 4;
		}

		if (value >= 2) {
			System.out.println("주차 가능");
			value -= 2;
		}

		if (value >= 1) {
			System.out.println("24시간");
			value -= 1;
		}
	}

}
