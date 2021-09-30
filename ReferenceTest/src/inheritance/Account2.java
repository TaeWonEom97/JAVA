package inheritance;

public class Account2 {
	private String accountnum;
	private int money;
	private String name;
	
	
	
	public Account2() {
		super();

	}
	public Account2(String accountnum, int money, String name) {
		super();
		this.accountnum = accountnum;
		this.money = money;
		this.name = name;
	}
	

	void input(int inputmoney) {
		money+=inputmoney;
	}
	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	int sub(int submoney) {
		if(money>submoney)
		{
			money-=submoney;
		}
		return money;
	}
}
