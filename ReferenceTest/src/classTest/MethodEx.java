package classTest;

public class MethodEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		//�޼ҵ� ȣ�� �� ���ϵǴ� ���� �ִ� ���
		//1. print()
		System.out.println(obj.isRedirect());
		//2. ���ϵǴ� �� �ޱ�(���´� �տ� �޴� �Ŷ� �Ȱ��� ���� int�� 
		//   int���� �Ѵ�.
		boolean result=obj.isRedirect();
		
		int var1=obj.sum();
		System.out.println(obj.add(25,35));
	}

}
