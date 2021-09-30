package classTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		GoodsStock stock = new GoodsStock();
		stock.code="P12345";
		stock.a=100;
		
		stock.sum(10); 
		int product=stock.sub(15);
		System.out.println("현재 재고수량"+product);
		
		
	}

}
