package test;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("����� �Է��Ͻÿ�. : ");
		String grade = k.next();
//		switch (grade) {
//		case "A":
//		case "a":
//		{
//			System.out.println("���ȸ��");
//			break;
//		}
//		case "B":
//		case "b":
//		{
//			System.out.println("�Ϲ�ȸ��");
//			break;
//		}
//		default:
//			System.out.println("�մ�");
//		}
		if (grade == "A" || grade == "a") {
			System.out.println("���ȸ��");
		} else if (grade == "B" || grade == "b") {
			System.out.println("�Ϲ�ȸ��");
		} else {
			System.out.println("�մ�");
		}
	}

}
