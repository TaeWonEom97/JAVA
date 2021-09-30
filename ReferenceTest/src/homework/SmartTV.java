package homework;

public class SmartTV extends Product{
	private String resolution;

	SmartTV(String pname, int price,String resolution) {
		super(pname, price);
		this.resolution=resolution;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 정보 : "+resolution);
	}

}
