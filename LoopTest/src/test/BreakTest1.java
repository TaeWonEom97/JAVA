package test;

public class BreakTest1 {

	public static void main(String[] args) {
		while(true) {
			int a=(int)(Math.random()*6)+1;
			System.out.println("���� ���� : "+a);
			if(a==6) {
				System.out.println("���� 6�Դϴ�. ����Ǿ����ϴ�.");
				break;
			}
		}
	}

}
