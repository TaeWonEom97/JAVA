package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하시오. :");
		int fh = k.nextInt();
		double ch = (double)(fh-32)*5/9;
		System.out.printf("섭씨 온도: %.2f 도입니다.\n",ch);
	}

}
