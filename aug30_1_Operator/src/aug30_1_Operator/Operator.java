package aug30_1_Operator;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		System.out.println("---편의점 택배---");
		Scanner k = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double a = k.nextDouble();
		
		System.out.print("세로 : ");
		double b = k.nextDouble();
		
		System.out.print("높이 : ");
		double c = k.nextDouble();
		
		System.out.print("무게 : ");
		double d = k.nextDouble();
		
		System.out.println("---------------");
		double e = a*b*c;
		System.out.printf("부피 : %.1f\n",e);
		System.out.println("무게 : "+d);
		
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