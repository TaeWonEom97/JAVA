package aug30_3_ConditionalStmt;

import java.util.Scanner;

public class CSMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int middletest = k.nextInt();

		System.out.print("기말고사 : ");
		int finaltest = k.nextInt();

		double average = (double) (middletest + finaltest) / 2;

		System.out.printf("평균 : %.1f\n", average);

		if (average >= 90) {
			System.out.println("수");
		} else if (average >= 80) {
			System.out.println("우");
		} else if (average >= 70) {
			System.out.println("미");
		} else if (average >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

	}

}
