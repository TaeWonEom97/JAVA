package classTest;

public class AccountEx3 {

	public static void main(String[] args) {
//		Account3 account1 = new Account3("122-12",25000,"���¿�");
//		Account3 account2 = new Account3("122-12",26000,"���¿�");
//		Account3 account3 = new Account3("122-12",27000,"���¿�");
//		Account3 account4 = new Account3("122-12",28000,"���¿�");
//		Account3 account5 = new Account3("122-12",29000,"���¿�");
		
		Account3 accArr[] = new Account3[5];
//		System.out.println(accArr[0]);
		
		
		accArr[0] = new Account3("122-12",25000,"���¿�");
		accArr[1] = new Account3("122-12",26000,"���¿�");
		accArr[2] = new Account3("122-12",27000,"���¿�");
		accArr[3] = new Account3("122-12",28000,"���¿�");
		accArr[4] = new Account3("122-12",29000,"���¿�");
		
		accountPrint(accArr);

		
		for(int i=0;i<accArr.length;i++) {
			Account3 account = accArr[i];
			
			//�Ա�
			account.deposit(10000);
			accountPrint(account);
//			
//			System.out.print(accArr[i].getAccountNo()+" ");
//			System.out.print(accArr[i].getBalance()+" ");
//			System.out.println(accArr[i].getName());
		}
	}
	static void accountPrint(Account3 accArr[]) {
		for(int i=0;i<accArr.length;i++) {
			System.out.print(accArr[i].getAccountNo()+" ");
			System.out.print(accArr[i].getBalance()+" ");
			System.out.println(accArr[i].getName());
		}
	}

	static void accountPrint(Account3 account) {
		System.out.print(account.getAccountNo()+" ");
		System.out.print(account.getBalance()+" ");
		System.out.println(account.getName());
	}
}
