package classTest;

public class GoodsStock2 {
	private String code;
	private int a;
	GoodsStock2() {
		
	}
	GoodsStock2(String code,int a){
		this.a=a;
		this.code=code;
	}
	
	void sum(int amount) {
		a+=amount;
		System.out.println(a);
	}
	
	
	int sub(int amount) {
		if(a>amount) {
			a-=amount;
		}
		return a; 
	}
	
	int getStockNum() {
		return a;
	}
}
