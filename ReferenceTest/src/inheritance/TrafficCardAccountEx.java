package inheritance;

public class TrafficCardAccountEx {

	public static void main(String[] args) {
		TrafficCardAccount tcard = new TrafficCardAccount("122-14", 100000, 
				"���¿�","3333-44", true);
		
		System.out.println("�����ܾ� : "+tcard.payc("3333-44", 10000));
	}

}
