package test;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		String fruit[] = {"���","��","����","���ξ���","����"};
		for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		
		//���� for��
		for(String f:fruit) {
			System.out.println(f);
		}
		
	}

}
