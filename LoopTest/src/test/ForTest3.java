package test;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("몇 단인지 입력하시오. : ");
		int i = k.nextInt();
		int sum = 0;
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " X " + j + '=' + i * j);
		}

	}

}
