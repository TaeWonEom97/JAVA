package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount check = new CheckingAccount("122-12",20000,"╬Жеб©Ь","122-12-133");
		
		System.out.println(check.pay("122-12-133",2000));
	}

}
