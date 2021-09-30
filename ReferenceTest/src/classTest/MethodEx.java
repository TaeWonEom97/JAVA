package classTest;

public class MethodEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		//메소드 호출 시 리턴되는 값이 있는 경우
		//1. print()
		System.out.println(obj.isRedirect());
		//2. 리턴되는 값 받기(형태는 앞에 받는 거랑 똑같이 받음 int면 
		//   int같게 한다.
		boolean result=obj.isRedirect();
		
		int var1=obj.sum();
		System.out.println(obj.add(25,35));
	}

}
