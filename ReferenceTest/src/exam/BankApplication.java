package exam;

import java.util.Scanner;


public class BankApplication {

	
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5. ����");
			System.out.println("-------------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if(selectNo ==3) {
				deposit();
			}else if(selectNo ==4) {
				withdraw();
			}else if(selectNo ==5) {
				run=false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		//�迭�� ����ִ��� Ȯ��
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = new Account(scanner.next(),scanner.next(),scanner.nextInt());
				System.out.println("���¹�ȣ : "+accountArray[i].getAno()+" "+"������ : "+accountArray[i].getOwner()+" "+"�ܾ� : "+accountArray[i].getBalance()+"��");							
				break;
			}
		}
	}
	private static void accountList() {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println("���¹�ȣ : "+accountArray[i].getAno()+" "+"������ : "+accountArray[i].getOwner()+" "+"�ܾ� : "+accountArray[i].getBalance()+"��");							
			}
		}
	}
	private static void deposit() {
		System.out.print("���ϴ� ���¸� �����Ͻÿ�. : ");
		String ano = scanner.next();
		
		Account account=findAccount(ano);
		if(account!=null) {
			System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ� : ");
			int money = scanner.nextInt();
			account.setBalance(account.getBalance()+money);
			System.out.println("���� �ݾ� : "+account.getBalance()+"��");			
		}else {
			System.out.println("�Աݰ��°� �ƴմϴ�.");
		}
		
	}
	private static void withdraw() {
		System.out.print("���ϴ� ���¸� �����Ͻÿ�. : ");
		String ano = scanner.next();
		
		Account account=findAccount(ano);
		if(account!=null) {
			System.out.print("����� �ݾ��� �Է��Ͻÿ� : ");
			int money = scanner.nextInt();
			account.setBalance(account.getBalance()-money);
			System.out.println("���� �ݾ� : "+account.getBalance()+"��");			
		}else {
			System.out.println("�Աݰ��°� �ƴմϴ�.");
		}
	}
	//Account �迭���� ano�� ������ Account��ü ã��
	private static Account findAccount(String ano) {
		Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(ano.equals(accountArray[i].getAno())) {
					account=accountArray[i];
					break;
				}		
			}
		}
		return account;
	}

}
