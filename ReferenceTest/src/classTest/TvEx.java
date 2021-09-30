package classTest;

public class TvEx {

	public static void main(String[] args) {
		
		//객체 선언, 생성
		TV tv = new TV();
		System.out.println(tv);
		
		//객체 조작
		tv.power=true;
		tv.channel=2;
		
		tv.channelUp();
		System.out.println("채널 상태 "+tv.channel);
	}

}
