package classTest;

/**
 * @author COM
 *
 */
public class Account {
	String accountnum;
	int money;
	String name;
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	void input(int inputmoney) {
		money+=inputmoney;
	}
	
	public Account(String accountnum, int money, String name) {
		super();
		this.accountnum = accountnum;
		this.money = money;
		this.name = name;
	}

	int sub(int submoney) {
		if(money>sub(submoney))
		{
			money-=submoney;
		}
		return money;
	}
}
