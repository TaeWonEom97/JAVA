package inheritance;

public class TrafficCardAccount extends CheckingAccount{
	private boolean hasTrafficCard;
	
	public TrafficCardAccount(String accountnum, int money, String name, 
			String carNo,boolean hasTrafficCard) {
		super(accountnum, money, name, carNo);
		this.hasTrafficCard=hasTrafficCard;
	}
	int payc(String cardNo,int tmoney) {
		if(!hasTrafficCard) {
			System.out.println("교통카드가 없습니다.");
			return 0;
		}
		return pay(cardNo,tmoney);
		
	}
	
	
}
