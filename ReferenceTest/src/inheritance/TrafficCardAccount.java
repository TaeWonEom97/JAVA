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
			System.out.println("����ī�尡 �����ϴ�.");
			return 0;
		}
		return pay(cardNo,tmoney);
		
	}
	
	
}
