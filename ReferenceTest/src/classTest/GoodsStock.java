package classTest;

public class GoodsStock {
	String code;
	int a;
	GoodsStock() {
		
	}
	GoodsStock(String code,int a){
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
}
