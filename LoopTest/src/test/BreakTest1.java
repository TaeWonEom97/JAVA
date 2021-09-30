package test;

public class BreakTest1 {

	public static void main(String[] args) {
		while(true) {
			int a=(int)(Math.random()*6)+1;
			System.out.println("나온 숫자 : "+a);
			if(a==6) {
				System.out.println("숫자 6입니다. 종료되었습니다.");
				break;
			}
		}
	}

}
