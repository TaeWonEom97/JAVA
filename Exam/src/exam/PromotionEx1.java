package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		byte byteValue = 10;
		
		int intValue=byteValue;
		System.out.println(intValue);
		
		intValue=500;
		long longValue=intValue;
		
		char charValue='A';
		char charValue2=1;
		
		int charValue3=charValue+charValue2;
		
		System.out.println(charValue3);
		
		//강제 형변환(casting)
		System.out.println((char)charValue3);
		
		
	}

}
