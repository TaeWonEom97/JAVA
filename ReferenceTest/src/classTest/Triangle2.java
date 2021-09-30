package classTest;

public class Triangle2 {
	private double height;
	private double x;
	

	Triangle2(double height,double x) {
		this.height=height;
		this.x=x;
	}
	
	
	double wide() {
		double result=(x*height)/2;
		return result;
		
	}
}
