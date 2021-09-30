package inheritance;

public class CaptionTV2 extends TV2 {
	boolean caption;

	
	public CaptionTV2(String color, boolean power, int channel) {
		super(color,power,channel);
	}
	
	
	void display(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
