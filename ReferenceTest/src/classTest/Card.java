package classTest;

public class Card {
	//��� ����
	private String kind;
	private int num;

	//class ����
	static int width=10;
	static int height=7;
	
	public Card(String kind, int num) {
		super();
		this.kind = kind;
		this.num = num;
	}
	
	public String getKind() {
		return kind;
	}

	public int getNum() {
		return num;
	}

	public static int getWidth() {
		return width;
	}

	public static int getHeight() {
		return height;
	}

	
	
}
