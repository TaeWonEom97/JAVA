package exception;

public class CatchByException {

	public static void main(String[] args) {

		try {
			// ArrayIndex
			String data1 = args[0];
			String data2 = args[1];
			// NumberFormat
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값을 확인해 주세요.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
