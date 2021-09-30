package string;

public class Trim {

	public static void main(String[] args) {
		String str1="            a           b    c";
		String str2="a           b    c";
		String newstr1=str1.trim();
		System.out.println(str1);
		System.out.println(newstr1);
		System.out.println(newstr1.equals(str2));

	}

}
