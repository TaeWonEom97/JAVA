package aug27_1_Variable;

import java.util.Scanner;

public class ConsoleInputMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�Ĵ� �̸� : ");
		String name = k.next();
				
		System.out.print("�Ĵ� ũ�� : ");
		double size = k.nextDouble();
		
		System.out.print("���̺� ����: ");
		int table= k.nextInt();
		
		System.out.print("���� �Ĵ���� : ");
		boolean open = k.nextBoolean();
		System.out.println(name);
		System.out.println(size);
		System.out.println(table+"��");
		System.out.println(open);
		
	}

}
