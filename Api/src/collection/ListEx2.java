package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jsp");
		list.add("Servlet");
		list.add("JDBC");
		list.add("java");
		
		list.add(2,"oracle");
		System.out.println(list);
		
		//����
		list.remove(1);
		System.out.println(list);
		
		//����
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}

}
