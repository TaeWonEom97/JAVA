package inheritance;

public class Child extends Parent {
	public Child(int age) {
		super(age);
	}
	
	void play() {
		System.out.println("����!!");
	}
	@Override
	public void print() {
		System.out.println("Hello");
	}
}
