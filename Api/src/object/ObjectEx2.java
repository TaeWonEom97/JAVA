package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		String str1="엄태원";
		String str2="엄태원";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		Value value1=new Value(10);
		Value value2=new Value(10);
		System.out.println(value1.toString());
		System.out.println(value2.toString());

	}

}
