package classTest;

public class TV3 {
	String color;
	boolean power;
	int channel;
	
	public TV3() {
		
	}

	public TV3(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
		
	public TV3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
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

	
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void setChannel(int channel) {
		this.channel = channel;
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
	
}
