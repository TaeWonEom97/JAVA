package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add("사과");
		list1.add("배");
		list1.add("복숭아");
		list1.add("딸기");
		list1.add("바나나");
		
//		for(String str:list1) {
//			System.out.println(str);
//		}
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		int sum=0;
		for(Integer i:list2) {
			System.out.println(i);
			sum+=i;
		}System.out.println(sum);
	}

}