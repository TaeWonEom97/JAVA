package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class BmiTestMain {

	public static void main(String[] args) {
		System.out.println("BMI�˻�");
		Scanner m = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = m.next();
		System.out.print("Ű : ");
		double height = m.nextDouble();
		if(height>=3) {
			height/=100;
		}
		System.out.print("������ : ");
		double weight = m.nextDouble();

		double bmi = (weight / (height * height));
		System.out.println("-----------------");
		System.out.printf("BMI������ %.2f\n", bmi);
		if (bmi > 35) {
			System.out.printf("%s���� �����Դϴ�.\n", name);
		} else if (bmi >= 30) {
			System.out.printf("%s���� �ߵ����Դϴ�.\n", name);
		} else if (bmi >= 25) {
			System.out.printf("%s���� �浵���Դϴ�.\n", name);
		} else if (bmi >= 23) {
			System.out.printf("%s���� ��ü���Դϴ�.\n", name);
		} else if (bmi >= 18.5) {
			System.out.printf("%s���� �����Դϴ�.\n", name);
		} else {
			System.out.printf("%s���� ��ü���Դϴ�.\n", name);
		}
	}

}
