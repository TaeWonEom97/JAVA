package poly;

public class Buyer {
	int money=2000;
	int bonusPoint=0;
	
	 void buy(Product p) {
		 if(money<p.getPrice()) {
			 System.out.println("잔액부족으로 인해 구매 실패");
			 return;
		 }
		 money-=p.getPrice();
		 bonusPoint +=p.getBonusPoint();
		 System.out.println(p+"을 구입하셨습니다. ");
		
	 }
}
