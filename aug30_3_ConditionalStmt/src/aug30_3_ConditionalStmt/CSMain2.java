package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class CSMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("�߰���� : ");
		int middletest = k.nextInt();

		System.out.print("�⸻��� : ");
		int finaltest = k.nextInt();

		double average = (double) (middletest + finaltest) / 2;

		System.out.printf("��� : %.1f\n", average);

		if (average >= 90) {
			System.out.println("��");
		} else if (average >= 80) {
			System.out.println("��");
		} else if (average >= 70) {
			System.out.println("��");
		} else if (average >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

	}

}
