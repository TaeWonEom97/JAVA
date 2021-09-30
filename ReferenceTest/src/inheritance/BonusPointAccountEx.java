package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("122-12", 10000,
				"엄태원",100);
		bonus.input(100000);
		System.out.println("현재 잔액 : "+bonus.getMoney());
		System.out.println("현재 보너스 포인드 : "+bonus.getBonusPoint());
	}

}
