package aug27_1_Variable;

import java.util.Scanner;

public class OperatorMain2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ű : ");
		double height = a.nextDouble();
		
		System.out.print("���� : ");
		int age = a.nextInt();
		
		System.out.println("------------------------------");
		System.out.println("Ű :" + height + "cm\t����" + age + "��");
		
		boolean t = height > 150;
		System.out.println(t);
		
		boolean k = (age <= 10);
		System.out.println(k);
		
		boolean ma = age>=5 && height>=200;
		System.out.println(ma);
		
		boolean ma2 = height>=200 || age>=5;
		System.out.println(ma2);
		
		boolean e = !ma2;
		System.out.println(e);
	}

}
