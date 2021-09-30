package test;

public class ArrayTest7 {

	public static void main(String[] args) {
		int score[]= {56,66,44,33,22,99};
		int max=score[0];
		int min=score[0];
		for(int i=1;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
			}else if(min>score[i]) {
				min=score[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
