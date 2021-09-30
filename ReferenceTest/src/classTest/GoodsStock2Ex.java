package classTest;

public class GoodsStock2Ex {

	public static void main(String[] args) {
		GoodsStock2 stock = new GoodsStock2("P12345",30);
//		stock.code="P12345";
//		stock.a=100;
		
		stock.sum(30); 
		int product=stock.sub(15);
		System.out.println("현재 재고수량"+stock.getStockNum());
		
	}

}
