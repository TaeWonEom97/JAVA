package classTest;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println("Data : "+data);//Data@5594a1b5 -> 데이터 주소값
		
		
		data.x=10;
		change(data.x);
		System.out.println("after change( )x = "+data.x);
		
		System.out.println();
		change(data);
	}
	static void change(int x) {
		x=10000;
		System.out.println("change( )x = "+x);
	}

	static void change(Data d) {
		System.out.println(d);
		
		d.x=10000;
		System.out.println(d.x);
	}
}
