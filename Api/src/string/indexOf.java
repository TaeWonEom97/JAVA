package string;

public class indexOf {

	public static void main(String[] args) {
		String str1="자바 프로그래밍";
		int index=str1.indexOf("프로그래밍");
		System.out.println(index);
		
		System.out.println("못찾는 경우"+str1.indexOf("파이썬"));
		
		System.out.println();
		
		String str2="hellohellohello world";
		System.out.println(str2.indexOf(65));
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2));
		System.out.println(str2.lastIndexOf("l"));
	}

}
