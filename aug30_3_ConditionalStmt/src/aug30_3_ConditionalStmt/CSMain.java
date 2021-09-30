package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class CSMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("마트");
		System.out.print("가격 : ");
		int price = k.nextInt();
		System.out.println("--------------");
		System.out.printf("%d 원어치 구매\n", price);
		int point = price / 100;
		
		if (price >= 10000) {
			point += 50;
		}
		
		if (price > 20000 & price < 50000) {
			point += 100;
		}else {
			point +=10;
		}
		System.out.printf("적립 포인트 : %d입니다.\n", point);

	}

}
