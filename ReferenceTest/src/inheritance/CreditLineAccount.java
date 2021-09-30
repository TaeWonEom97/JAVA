package inheritance;

public class CreditLineAccount extends Account2{
	private int creditLine;
	public CreditLineAccount(String accountnum, int money, String name,int creditLine) {
		super(accountnum, money, name);
		this.creditLine = creditLine;
	}
	@Override
	int sub(int submoney) {
		if(creditLine+getMoney()<submoney)
		{
			System.out.println("인출 불가");
			return 0;
		}
		setMoney(getMoney() - submoney);
		return getMoney();
	}
	
}
