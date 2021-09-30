package math;

public class MathEx2 {

	public static void main(String[] args) {
		while(true) {
			int math1=(int) (Math.random()*3)+1;
			int math2=(int) (Math.random()*3)+1;
			int math3=(int) (Math.random()*3)+1;
			System.out.println(math1+""+math2+""+math3);
			if(math1==math2&math2==math3&math1==math3) {
				break;
			}
		}
	}

}
