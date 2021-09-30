package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class MoneyChangeMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("물건 가격을 입력하시오. : ");
		int price = k.nextInt();
		System.out.print("지불한 금액을 입력하시오. : ");
		int money = k.nextInt();
		int change = money - price;
		System.out.println("--------------------");
		System.out.printf("거스름돈 : %d\n", change);
		if((((change%10000)%5000)%1000)%500 == 0) {
			System.out.println("5백원권 : "+(((change%10000)%5000)%1000)/500);
		}
		if(((change%10000)%5000)%1000 != 0) {
			System.out.println("1천원권 : "+((change%10000)%5000)/1000);
		}
		if((change%10000)%5000 !=0) {
			System.out.println("5천원권 : "+(change%10000)/5000);
		}
		if (change % 10000 != 0) {
			System.out.println("1만원권 : "+change / 10000);
		}
	}

}
