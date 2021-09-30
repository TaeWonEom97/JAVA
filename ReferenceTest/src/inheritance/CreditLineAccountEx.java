package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount credit = new CreditLineAccount("122-12",
				10000, "¾öÅÂ¿ø",1000000);
		
		System.out.println(credit.sub(15000000));
		System.out.println(credit.sub(100000));
				
	}

}
