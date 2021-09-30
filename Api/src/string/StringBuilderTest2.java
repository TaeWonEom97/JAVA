package string;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		String str1 = "hello java!!!";
//		char[] arr=str1.toCharArray();
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
			
	}

}
