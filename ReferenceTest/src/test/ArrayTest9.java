package test;

public class ArrayTest9 {

	public static void main(String[] args) {
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50}
		};
		int result[][] = new int[score.length+1][score[0].length+1];
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				result[i][j]=score[i][j];
				//���հ�
				result[i][result[i].length-1]+=result[i][j];
				
				//��ü�հ�
				result[result.length-1][result[i].length-1]+=score[i][j];	
			}
			//���հ�
			for(int k=0;k<3;k++) {
			result[result.length-1][k]+=result[i][k];
			}
			
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.printf("%d ",result[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
