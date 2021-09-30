package classTest;
//리턴타입 메소드명
public class MethodTest1 {
	boolean isRedirect() {
		return true;
	}
	
	int sum() {
		return 3;
	}
	
	int multiply(int num1,int num2) {
		return num1*num2;
	}
	
	long add(long num1,long num2) {
		return num1+num2;
	}
	
	char method() {
		return 'c';
	}
	void method1() { //void는 넘기는 값 없음
		System.out.println();
	}
	//리턴타입 : int형 1차원 배열
	//전달인자 : int형 1차원 배열
	int[] print(int arr[]) {
		return arr;
		
	//리턴타입 : double, 매개변수 : 두개의 double
		
	}
}
