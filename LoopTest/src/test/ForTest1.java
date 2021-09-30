package test;

public class ForTest1 {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for(int i=0;i<11;i+=2) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		int sum=0;
		for(int i=1;i<100;i++) {
			if(i%3==0 & i%9!=0) {
				sum=sum+i;
				
			}
		}
		System.out.println(sum);			
		
		System.out.println("----------------");
		int sum2=0;
		for(int i=0;i<100;i++) {
			if(i%3==0 | i%5==0) {
				sum2=sum2+i;
			}
		}System.out.println(sum2);
	}

}
