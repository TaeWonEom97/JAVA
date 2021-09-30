package exception;

public class AccountEx {

	public static void main(String[] args) throws Exception {
		Account account = new Account();
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
