package aug30_3_ConditionalStmt;

import java.util.Scanner;

//24�ð� : 1
//���� : 2
//���� : 4
//�������� : 8
//��� : 16
public class ShiftOperatorMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("��ġ�� �Է��Ͻÿ�. : ");
		int value = k.nextInt();

		if (value >= 16) {
			System.out.println("��ް���");
			value -= 16;
		}

		if (value >= 8) {
			System.out.println("�������� ����");
			value -= 8;
		}

		if (value >= 4) {
			System.out.println("���� ����");
			value -= 4;
		}

		if (value >= 2) {
			System.out.println("���� ����");
			value -= 2;
		}

		if (value >= 1) {
			System.out.println("24�ð�");
			value -= 1;
		}
	}

}
