package inheritance;

public class TrafficCardAccountEx {

	public static void main(String[] args) {
		TrafficCardAccount tcard = new TrafficCardAccount("122-14", 100000, 
				"엄태원","3333-44", true);
		
		System.out.println("현재잔액 : "+tcard.payc("3333-44", 10000));
	}

}
