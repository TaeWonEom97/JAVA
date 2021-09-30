package inheritance;

public class CaptionTVEx2 {

	public static void main(String[] args) {
		CaptionTV2 ctv = new CaptionTV2("black",true,8);
		ctv.channelUp();
		System.out.println("현재 채널 : "+ctv.getChannel());
		
		ctv.display("Hello world");
		ctv.caption=true;
		ctv.display("hello java");

	}

}
