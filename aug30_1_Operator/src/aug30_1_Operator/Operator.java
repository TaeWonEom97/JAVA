package aug30_1_Operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		System.out.println("---������ �ù�---");
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� : ");
		double a = k.nextDouble();
		
		System.out.print("���� : ");
		double b = k.nextDouble();
		
		System.out.print("���� : ");
		double c = k.nextDouble();
		
		System.out.print("���� : ");
		double d = k.nextDouble();
		
		System.out.println("---------------");
		double e = a*b*c;
		System.out.printf("���� : %.1f\n",e);
		System.out.println("���� : "+d);
		
		boolean aa = e>=10 && d>=1000;
		System.out.println(aa);
		
		boolean bb = e<10 || d<1000;
		System.out.println(bb);
		
		boolean cc = d>=20 && d>=30;
		System.out.println(cc);
		
		boolean dd = e<10 | d<1000;
		System.out.println(dd);
	}

}