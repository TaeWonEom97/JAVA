package inheritance;

public class CheckingAccount extends Account2 {
	private String cardNo;

	public CheckingAccount(String accountnum, int money, String name,String carNo) {
		super(accountnum, money, name);
		this.cardNo=carNo;
	}
	 int pay(String cardNo,int amount) {
		if(!cardNo.equals(this.cardNo)|| getMoney()<amount) {
			System.out.println("ī�� ��ȣ�� ���ݾ��� Ȯ�����ּ���.");
			return 0;
		}	
		return sub(amount);
	}
}