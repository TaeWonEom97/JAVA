package classTest;

public class MethodTest2 {
	int sum(int num1, int num2) {
		//return num1+num2; -> 한줄로 표현한 것
		int result = num1 + num2;
		return result;	
	}
	
	void print99dan() {
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
	}
	
	int mul(int num1,int num2) {
		int result=num1*num2;
		return result;
	}
}
