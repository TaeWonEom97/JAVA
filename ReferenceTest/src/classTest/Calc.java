package classTest;

public class Calc {
	int plus(int x,int y) {
		return x+y;
	}
	
	double avg(int x,int y) {
//		return (x+y)/2;
		int sum=plus(x,y);
		return sum/2;
	}
	
	void execute() {
		double result = avg(4,5);
		println("������ : "+result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
}
