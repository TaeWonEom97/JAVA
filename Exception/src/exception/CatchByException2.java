package exception;

public class CatchByException2 {

	public static void main(String[] args) {
		try {
			// ArrayIndex
			String data1 = args[0];
			String data2 = args[1];
			// NumberFormat
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�Է°��̳� ���ڷ� ��ȯ�� �� ���� ���� �ֽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("�� �� ���� ���� �߻�");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}

}
