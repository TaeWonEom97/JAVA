package aug27_1_Variable;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("��ǰ�� : ");
		String name=k.next();
		
		System.out.print("���� : ");
		int price=k.nextInt();
		
		System.out.print("���� : ");
		double weight=k.nextDouble();
		
		System.out.println("------------------");
		System.out.println("��ǰ�� :"+name);
		System.out.println("���� :"+price+"��");
		System.out.println("���� :"+weight+"g");
		
//		printf�϶�
		System.out.printf("ǰ�� : %s\n",name);
		System.out.printf("���� : %05d\n",price);
		System.out.printf("���� : %.3f\n",weight);		
		System.out.printf("���� : %.5f%%\n",weight);		
	}

}
