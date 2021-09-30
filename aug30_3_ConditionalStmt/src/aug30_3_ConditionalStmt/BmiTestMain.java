package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class BmiTestMain {

	public static void main(String[] args) {
		System.out.println("BMI검사");
		Scanner m = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = m.next();
		System.out.print("키 : ");
		double height = m.nextDouble();
		if(height>=3) {
			height/=100;
		}
		System.out.print("몸무게 : ");
		double weight = m.nextDouble();

		double bmi = (weight / (height * height));
		System.out.println("-----------------");
		System.out.printf("BMI지수는 %.2f\n", bmi);
		if (bmi > 35) {
			System.out.printf("%s님은 고도비만입니다.\n", name);
		} else if (bmi >= 30) {
			System.out.printf("%s님은 중도비만입니다.\n", name);
		} else if (bmi >= 25) {
			System.out.printf("%s님은 경도비만입니다.\n", name);
		} else if (bmi >= 23) {
			System.out.printf("%s님은 과체중입니다.\n", name);
		} else if (bmi >= 18.5) {
			System.out.printf("%s님은 정상입니다.\n", name);
		} else {
			System.out.printf("%s님은 저체중입니다.\n", name);
		}
	}

}
