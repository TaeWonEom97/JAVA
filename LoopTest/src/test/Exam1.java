package test;

public class Exam1 {

	public static void main(String[] args) {
		while(true) {
			int a1 = (int)(Math.random()*6)+1;
			int a2 = (int)(Math.random()*6)+1;
			System.out.printf("�ֻ��� �� ( %d, %d)\n",a1,a2);
			if(a1+a2==5) {
				System.out.println("�ֻ��� ���� ���� 5 = ���α׷�����");
				break;
			}
		}
	}

}
