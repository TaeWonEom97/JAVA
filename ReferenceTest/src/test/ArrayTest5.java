package test;

public class ArrayTest5 {
	public static void main(String[] args) {
		int score[][]= new int[2][3];
		score[0][0]=15;
		score[0][1]=15;
		score[0][2]=15;
		score[1][0]=15;
		score[1][1]=15;
		score[1][2]=15;
		
		System.out.println(score.length);
		System.out.println(score[0].length);
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
	}
}
