package aug27_1_Variable;

import java.util.Scanner;

//stack - ���α׷� ����� �ڵ� �ݳ� -> ���� �ݳ� �Ұ���
//heap - �ڵ��ݳ� �ȵ� -> �������� �ݳ�ó���ؾ� ��
//	java���� GarbageCollection(heap���� �ڵ����� �ý���)��� ����
// ���� ����Ʈ : heap���� �ڵ����� �ý����� ����?
public class VariableMain {

	public static void main(String[] args) {
		long am = 800000000;
		double a = 1.322323223;
		int korea;
		korea = 80;
		System.out.println(korea);
		System.out.println(korea);
		System.out.println(korea);
		System.out.println(korea);
		
		float temp;
		temp = (float)24.38; //����ȯ
		System.out.println(temp+"��");
		
		char t;
		t = '��';
		System.out.println(t);
		
		String tt;
		tt = "����";
		System.out.println(tt);
		
		boolean isHungry,notHungry;
		isHungry = true;
		notHungry = false;
		System.out.println(isHungry);
		System.out.println(notHungry);
		
		int age = 25;
//		System.out.println("���̸� �Է��ϼ���");
//		Scanner sc = new Scanner(System.in);
//		age = sc.nextInt();
		System.out.println(age);
		
		
		
	}

}
