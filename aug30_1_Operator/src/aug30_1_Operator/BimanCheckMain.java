package aug30_1_Operator;

import java.util.Scanner;

public class BimanCheckMain {

	public static void main(String[] args) {
		System.out.println("�񸸵� �˻�------");
		Scanner m = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = m.next();
		System.out.print("Ű : ");
		double height = m.nextDouble();
		System.out.print("������ : ");
		double weight = m.nextDouble();

		System.out.println("---------------");
		double average = (height - 100) * 0.9;
		double percentage = (weight / average) * 100;
		System.out.printf("ǥ��ü�� : %.2f\n", average);
		System.out.printf("�񸸵� : %.2f\n", percentage);

		String g = (percentage > 120) ? "��" : "����";
		System.out.printf("%s���� %s�Դϴ�.\n",name,g);
	}

}
