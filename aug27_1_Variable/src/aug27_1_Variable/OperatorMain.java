package aug27_1_Variable;

import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("x :");
		int x = k.nextInt();
		System.out.print("y :");
		int y = k.nextInt();
		System.out.println("-------------");
		System.out.printf("x�� %d y�� %d\n", x, y);

		String laugh="��";
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		double d = (double)x / (double)y;
		int e = x%y;
		System.out.println("-------------");
		System.out.println("�� ="+a);
		System.out.println("�� ="+b);
		System.out.println("�� ="+c);
		System.out.println("������ ="+d);
		System.out.println("������ ="+e);
		
		System.out.println("-------------");
		x+=5;
		System.out.println(x);
		y-=3;
		System.out.println(y);
		
		System.out.println("---------------");
		x++;
		System.out.println(x);
	}

}
