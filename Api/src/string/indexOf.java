package string;

public class indexOf {

	public static void main(String[] args) {
		String str1="�ڹ� ���α׷���";
		int index=str1.indexOf("���α׷���");
		System.out.println(index);
		
		System.out.println("��ã�� ���"+str1.indexOf("���̽�"));
		
		System.out.println();
		
		String str2="hellohellohello world";
		System.out.println(str2.indexOf(65));
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2));
		System.out.println(str2.lastIndexOf("l"));
	}

}
