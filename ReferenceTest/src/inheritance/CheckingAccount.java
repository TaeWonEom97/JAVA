package inheritance;

public class CheckingAccount extends Account2 {
	private String cardNo;

	public CheckingAccount(String accountnum, int money, String name,String carNo) {
		super(accountnum, money, name);
		this.cardNo=carNo;
	}
	 int pay(String cardNo,int amount) {
		if(!cardNo.equals(this.cardNo)|| getMoney()<amount) {
			System.out.println("카드 번호와 사용금액을 확인해주세요.");
			return 0;
		}	
		return sub(amount);
	}
}