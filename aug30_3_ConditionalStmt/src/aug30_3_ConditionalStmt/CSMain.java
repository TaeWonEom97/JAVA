package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class CSMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("��Ʈ");
		System.out.print("���� : ");
		int price = k.nextInt();
		System.out.println("--------------");
		System.out.printf("%d ����ġ ����\n", price);
		int point = price / 100;
		
		if (price >= 10000) {
			point += 50;
		}
		
		if (price > 20000 & price < 50000) {
			point += 100;
		}else {
			point +=10;
		}
		System.out.printf("���� ����Ʈ : %d�Դϴ�.\n", point);

	}

}
