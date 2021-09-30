package aug27_1_Variable;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("제품명 : ");
		String name=k.next();
		
		System.out.print("가격 : ");
		int price=k.nextInt();
		
		System.out.print("무게 : ");
		double weight=k.nextDouble();
		
		System.out.println("------------------");
		System.out.println("제품명 :"+name);
		System.out.println("가격 :"+price+"원");
		System.out.println("무게 :"+weight+"g");
		
//		printf일때
		System.out.printf("품명 : %s\n",name);
		System.out.printf("가격 : %05d\n",price);
		System.out.printf("무게 : %.3f\n",weight);		
		System.out.printf("무게 : %.5f%%\n",weight);		
	}

}
