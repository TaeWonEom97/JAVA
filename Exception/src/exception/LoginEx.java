package exception;

public class LoginEx {

	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NotExistIDException, WrongPassWordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");

		}
		if (!password.equals("12345")) {
			throw new WrongPassWordException("�н����尡 Ʋ���ϴ�.");
		}
	}

}
