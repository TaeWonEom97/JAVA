package aug27_1_Variable;

import java.util.Scanner;

public class ConsoleInputMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("식당 이름 : ");
		String name = k.next();
				
		System.out.print("식당 크기 : ");
		double size = k.nextDouble();
		
		System.out.print("테이블 개수: ");
		int table= k.nextInt();
		
		System.out.print("현재 식당상태 : ");
		boolean open = k.nextBoolean();
		System.out.println(name);
		System.out.println(size);
		System.out.println(table+"개");
		System.out.println(open);
		
	}

}
