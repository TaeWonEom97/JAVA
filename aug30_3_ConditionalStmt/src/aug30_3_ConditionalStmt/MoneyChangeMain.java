package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class MoneyChangeMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�. : ");
		int price = k.nextInt();
		System.out.print("������ �ݾ��� �Է��Ͻÿ�. : ");
		int money = k.nextInt();
		int change = money - price;
		System.out.println("--------------------");
		System.out.printf("�Ž����� : %d\n", change);
		if((((change%10000)%5000)%1000)%500 == 0) {
			System.out.println("5����� : "+(((change%10000)%5000)%1000)/500);
		}
		if(((change%10000)%5000)%1000 != 0) {
			System.out.println("1õ���� : "+((change%10000)%5000)/1000);
		}
		if((change%10000)%5000 !=0) {
			System.out.println("5õ���� : "+(change%10000)/5000);
		}
		if (change % 10000 != 0) {
			System.out.println("1������ : "+change / 10000);
		}
	}

}
