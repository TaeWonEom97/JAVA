package classTest;

public class Triangle3Ex {

	public static void main(String[] args) {
		Triangle3 triangle1 = new Triangle3(10, 15);
		
		Triangle3 triArr[] = new Triangle3[5];
		triArr[0] = new Triangle3(10, 5);
		triArr[1] = new Triangle3(9, 4);
		triArr[2] = new Triangle3(8, 3);
		triArr[3] = new Triangle3(7,2);
		triArr[4] = new Triangle3(6, 1);
		
		printtri(triArr);
	}

	static void printtri(Triangle3 triArr[]) {
		for(int i=0;i<triArr.length;i++) {
			System.out.println(triArr[i].wide());
		}
	}

}
