package test;

public class ArrayTest4 {

	public static void main(String[] args) {
		int score[]= {80,100,100,95,90};
		int sum=0;
		double average=0;
//		for(int i=0;i<score.length;i++) {
//			sum+=score[i];
//			average=(double)sum/score.length;
//		}System.out.printf("������ %d�̰� ����� %.2f�̴�.\n",sum,average);
		for(int jumsu:score) {
			sum+=jumsu;
		}System.out.println(sum);
	
	}
	

}
