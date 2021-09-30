package aug30_1_Operator;

import java.util.Scanner;

public class BimanCheckMain {

	public static void main(String[] args) {
		System.out.println("비만도 검사------");
		Scanner m = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = m.next();
		System.out.print("키 : ");
		double height = m.nextDouble();
		System.out.print("몸무게 : ");
		double weight = m.nextDouble();

		System.out.println("---------------");
		double average = (height - 100) * 0.9;
		double percentage = (weight / average) * 100;
		System.out.printf("표준체중 : %.2f\n", average);
		System.out.printf("비만도 : %.2f\n", percentage);

		String g = (percentage > 120) ? "비만" : "정상";
		System.out.printf("%s씨는 %s입니다.\n",name,g);
	}

}
