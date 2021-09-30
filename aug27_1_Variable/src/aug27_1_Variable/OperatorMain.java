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
		System.out.printf("x는 %d y는 %d\n", x, y);

		String laugh="ㅋ";
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		double d = (double)x / (double)y;
		int e = x%y;
		System.out.println("-------------");
		System.out.println("합 ="+a);
		System.out.println("차 ="+b);
		System.out.println("곱 ="+c);
		System.out.println("나누기 ="+d);
		System.out.println("나머지 ="+e);
		
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
