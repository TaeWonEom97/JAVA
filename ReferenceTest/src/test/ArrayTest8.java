package test;

public class ArrayTest8 {

	public static void main(String[] args) {
		int card[]=new int[45];

		
		for(int i=0;i<card.length;i++) {
			card[i]=i+1;
		}
//		for(int d:card) {
//			System.out.print(d+" ");
//		}
		for(int j=0;j<card.length;j++) {
			int ra=(int)(Math.random()*45);
			int temp=card[j];
			card[j]=card[ra];
			card[ra]=temp;
		}
		System.out.println();
		for(int d:card) {
			System.out.print(d+" ");
		}
	}

}
