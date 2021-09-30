package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		
		String str1="엄태원";
		String str2="엄태원";
		System.out.println(str1.equals(str2));
		
		Value value1=new Value(10);
		Value value2=new Value(10);
		System.out.println(value1.equals(value2));
	}

}
