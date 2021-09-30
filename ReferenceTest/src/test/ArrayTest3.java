package test;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		String fruit[] = {"사과","배","수박","파인애플","참외"};
		for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		
		//향상된 for문
		for(String f:fruit) {
			System.out.println(f);
		}
		
	}

}
