package classTest;

public class CarEx2 {
	public static void main(String[] args) {
		//객체 생성 시 생성자 자동 호출
		Car2 car = new Car2();
		Car2 car2 = new Car2("maserati");
		Car2 car3 = new Car2("maserati","black");
		Car2 car4 = new Car2("maserati","기블리","black",360);
		
		car.forward();
		car2.backward();
		
		
		
		
		
		
	}

}
