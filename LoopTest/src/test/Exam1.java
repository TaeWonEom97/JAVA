package test;

public class Exam1 {

	public static void main(String[] args) {
		while(true) {
			int a1 = (int)(Math.random()*6)+1;
			int a2 = (int)(Math.random()*6)+1;
			System.out.printf("주사위 눈 ( %d, %d)\n",a1,a2);
			if(a1+a2==5) {
				System.out.println("주사위 눈의 합이 5 = 프로그램종료");
				break;
			}
		}
	}

}
