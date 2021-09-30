package exam;

import java.util.Scanner;


public class BankApplication {

	
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");
			
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
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		//배열이 비어있는지 확인
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = new Account(scanner.next(),scanner.next(),scanner.nextInt());
				System.out.println("계좌번호 : "+accountArray[i].getAno()+" "+"계좌주 : "+accountArray[i].getOwner()+" "+"잔액 : "+accountArray[i].getBalance()+"원");							
				break;
			}
		}
	}
	private static void accountList() {
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println("계좌번호 : "+accountArray[i].getAno()+" "+"계좌주 : "+accountArray[i].getOwner()+" "+"잔액 : "+accountArray[i].getBalance()+"원");							
			}
		}
	}
	private static void deposit() {
		System.out.print("원하는 계좌를 선택하시오. : ");
		String ano = scanner.next();
		
		Account account=findAccount(ano);
		if(account!=null) {
			System.out.print("입금할 금액을 입력하시오 : ");
			int money = scanner.nextInt();
			account.setBalance(account.getBalance()+money);
			System.out.println("현재 금액 : "+account.getBalance()+"원");			
		}else {
			System.out.println("입금계좌가 아닙니다.");
		}
		
	}
	private static void withdraw() {
		System.out.print("원하는 계좌를 선택하시오. : ");
		String ano = scanner.next();
		
		Account account=findAccount(ano);
		if(account!=null) {
			System.out.print("출금할 금액을 입력하시오 : ");
			int money = scanner.nextInt();
			account.setBalance(account.getBalance()-money);
			System.out.println("현재 금액 : "+account.getBalance()+"원");			
		}else {
			System.out.println("입금계좌가 아닙니다.");
		}
	}
	//Account 배열에서 ano와 동일한 Account객체 찾기
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
