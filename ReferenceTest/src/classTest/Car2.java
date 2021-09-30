package classTest;

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	Car2(){
		System.out.println("Car2기본생성자");
	}
	Car2(String model){
		System.out.println("Car2 생성자 - model 초기화");
	}
	Car2(String model,String color){
		System.out.println("Car2 생성자 - model,color 초기화");
	}
	Car2(String company,String model,String color,int maxSpeed){
		System.out.println("Car2 생성자 - 속성 모두 초기화");
	}
	
	void forward() {
		System.out.println("전진하다");
	}
	
	void backward() {
		System.out.println("후진하다");
	}
}
