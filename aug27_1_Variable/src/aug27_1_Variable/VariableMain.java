package aug27_1_Variable;

import java.util.Scanner;

//stack - 프로그램 종료시 자동 반납 -> 수동 반납 불가능
//heap - 자동반납 안됨 -> 수동으로 반납처리해야 함
//	java에는 GarbageCollection(heap영역 자동정리 시스템)기능 있음
// 면접 포인트 : heap영역 자동정리 시스템은 언제?
public class VariableMain {

	public static void main(String[] args) {
		long am = 800000000;
		double a = 1.322323223;
		int korea;
		korea = 80;
		System.out.println(korea);
		System.out.println(korea);
		System.out.println(korea);
		System.out.println(korea);
		
		float temp;
		temp = (float)24.38; //형변환
		System.out.println(temp+"도");
		
		char t;
		t = 'ㅋ';
		System.out.println(t);
		
		String tt;
		tt = "ㅋㅋ";
		System.out.println(tt);
		
		boolean isHungry,notHungry;
		isHungry = true;
		notHungry = false;
		System.out.println(isHungry);
		System.out.println(notHungry);
		
		int age = 25;
//		System.out.println("나이를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		age = sc.nextInt();
		System.out.println(age);
		
		
		
	}

}
