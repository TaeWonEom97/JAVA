package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {

	public static void main(String[] args) {
		String text="ȫ�浿/������/�ڿ���/�̼�ȫ";
		StringTokenizer st = new StringTokenizer(text,"/");
		String[] names = text.split("/");
		for(String s:names) {
			System.out.println(s);
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
