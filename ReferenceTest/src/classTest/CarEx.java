package classTest;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car);
		car.company = "����";
		car.model="kona";
		car.forward();
		car.backward();
	}

}
