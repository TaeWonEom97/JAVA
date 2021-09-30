package inheritance;

public class CaptionTV extends TV {
	boolean caption;
	
	void display(String text) {
		if(caption) {
			System.out.println(text);
		}		
	}
}
