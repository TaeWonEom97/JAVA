package aug30_1_Operator;

import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		int a = 3 << 2;
		System.out.println(a);

		Scanner k = new Scanner(System.in);
		
		System.out.println("�̸� : ");
		String name = k.next();
		
		System.out.print("���� : ");
		int age = k.nextInt();
		
//		if (age >= 20) {
//			String say = "�ȳ��ϼ���";
//			System.out.println(say);
//		} else
//			System.out.println("����");
		
		String say = (age>=20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		
		String say2 = (name.equals("ȫ�浿")) ? "��?��!" : "�������";
		System.out.println(say2);
		//�ȵǴ� ���� 
		//�����ڶ�� �͵��� stack������ ���
		//ȫ�浿�� heap�� ����־ �����ؾ���
		
		String oe = (age%2==1) ? "Ȧ" : "¦";
		System.out.println(oe);
		
		
		
	}

}
