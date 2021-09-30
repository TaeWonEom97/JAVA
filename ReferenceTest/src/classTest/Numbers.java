package classTest;

public class Numbers {
	private int num[];

	public Numbers(int[] num) {
		super();
		this.num = num;
	}

	int sum() {
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			result += num[i];
		}
		return result;
	}

	double avg() {
		return sum() / num.length;
	}
}
