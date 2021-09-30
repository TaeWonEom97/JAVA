package aug30_1_Operator;

import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		int a = 3 << 2;
		System.out.println(a);

		Scanner k = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = k.next();
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		
//		if (age >= 20) {
//			String say = "안녕하세요";
//			System.out.println(say);
//		} else
//			System.out.println("나가");
		
		String say = (age>=20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		String say2 = (name.equals("홍길동")) ? "어?야!" : "어서오세요";
		System.out.println(say2);
		//안되는 이유 
		//연산자라는 것들은 stack영역이 대상
		//홍길동은 heap에 들어있어서 참조해야함
		
		String oe = (age%2==1) ? "홀" : "짝";
		System.out.println(oe);
		
		
		
	}

}
