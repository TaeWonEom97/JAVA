package exception;

public class UnCheckedException {
//ArrayIndexOutofBoundsException
	public static void main(String[] args) {
		
//		if(args.length==2) {
//			
//			String data1 = args[0];
//			String data2 = args[1];
//			
//			System.out.println("args[0]"+data1);
//			System.out.println("args[1]"+data2);
//			
//		}
		
		String data1=null;
		String data2=null;
		
		try {
			data1=args[0];
			data2=args[1];
		} catch (Exception e) {
			System.out.println("실행 매개 변수 수가 부족합니다.");
		}
	}

}
