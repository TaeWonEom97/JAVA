package inheritance;

public class TV2 {
	private String color;
	private boolean power;
	private int channel;
	
	TV2(){
		super();
	}
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	TV2(String color,int channel){
		this.color=color;
		this.channel=channel;
	}
	
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void power() {
		power = !power;
	}
	
	
	public String getColor() {
		return color;
	}
	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
}
