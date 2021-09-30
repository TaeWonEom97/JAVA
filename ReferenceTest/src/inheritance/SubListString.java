package inheritance;

public class SubListString extends ListString {
	String name="박지연";
	@Override
	public void List() {
		super.List();//부모의 list를 호출
		System.out.println(name+"하위 클래스");
	}
	
	public void writer() {
		System.out.println(super.name);
		super.List();
	}
}
