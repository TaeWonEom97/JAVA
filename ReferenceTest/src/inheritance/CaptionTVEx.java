package inheritance;

public class CaptionTVEx {

	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재 채널 : "+ctv.channel);
		
		ctv.display("Hello world");
		ctv.caption=true;
		ctv.display("hello java");
	}

}
