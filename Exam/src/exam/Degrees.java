package exam;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��Ͻÿ�. :");
		int fh = k.nextInt();
		double ch = (double)(fh-32)*5/9;
		System.out.printf("���� �µ�: %.2f ���Դϴ�.\n",ch);
	}

}
