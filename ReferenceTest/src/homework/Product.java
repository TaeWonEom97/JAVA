package homework;

public abstract class Product {
	private String pname;
	private int price;
	private String resolution;
	
	MyShop myshop = new MyShop();
	Product(String pname,int price){
		super();
		this.pname=pname;
		this.price=price;

	}
	public String getPname() {
		return pname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	

	void printDetail() {
		System.out.println("상품명 : "+this.pname);
		System.out.println("가격 : "+this.price);
		printExtra();
	}
	
	public abstract void printExtra();

	
	
}
