package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("hong","hong1234","홍길동"));
		list.add(new Member("hong1","hong1256","김길동"));
		list.add(new Member("hong2","hong1278","최길동"));
		list.add(new Member("hong3","hong129","박길동"));
		list.add(new Member("hong4","hong1210","엄길동"));
		
		for(Member str:list) {
			System.out.println(str);
		}
	}

}
