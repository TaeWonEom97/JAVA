package classTest;

public class Account3 {
	private String accountNo;
	private int balance;
	private String name;
	
	public Account3() {
		super();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account3(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}

	public Account3(String accountNo, int balance, String name) {
//		super();
//		this.accountNo = accountNo;
//		this.name = name;
		this(accountNo,name);
		this.balance = balance;
		
	}
	void deposit(int amount) {
		balance+=amount;
	}
	int withdraw(int amount) {
		if(balance>amount) {
			balance-=amount;
		}
		return balance;
	}
}
