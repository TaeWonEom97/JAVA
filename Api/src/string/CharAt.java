package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		char ch = str1.charAt(3);
		System.out.println(ch);
		

		System.out.println();
		boolean flag=false;
//		for(int i=0;i<str1.length();i++) {
//			if(str1.charAt(i)=='그') {
//				flag=true;
//				break;
//			}
//			
//		}System.out.println(flag? "포함하고있음":"포함하고 있지않음");
		
		System.out.println(str1.indexOf('그')>-1?"포함":"미포함");
			
		
		System.out.println();
		
		String str2 = "hello java!!";
		char arr[]= new char[str2.length()];
		for(int i=0;i<str2.length();i++) {
			arr[i]=str2.charAt(i);
			System.out.println(arr[i]);
		}
	}

}
