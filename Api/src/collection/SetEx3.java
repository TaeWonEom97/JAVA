package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("hong","hong1234","홍길동"));
		set.add(new Member("hong1","hong1256","김길동"));
		set.add(new Member("hong2","hong1278","최길동"));
		set.add(new Member("hong3","hong129","박길동"));
		set.add(new Member("hong4","hong1210","엄길동"));
		
		for(Member i:set) {
			System.out.println(i);
		}
	}

}
