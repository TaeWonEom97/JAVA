package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("hong","hong1234","ȫ�浿"));
		list.add(new Member("hong1","hong1256","��浿"));
		list.add(new Member("hong2","hong1278","�ֱ浿"));
		list.add(new Member("hong3","hong129","�ڱ浿"));
		list.add(new Member("hong4","hong1210","���浿"));
		
		for(Member str:list) {
			System.out.println(str);
		}
	}

}
