package classTest;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		account.accountnum = "122-01-12222";
		account.money = 10000;
		account.name = "���¿�";
		account.input(3000);
		account.sub(2000);
		System.out.println("�����ܾ� : "+account.money);
	}
}
