package classTest;

public class Tv2 {
	
	String color;
	boolean power;
	int channel;
	
	Tv2(){
		
	}
	Tv2(String color,int channel){
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
}
