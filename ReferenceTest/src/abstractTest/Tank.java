package abstractTest;

public class Tank extends Unit{


	void changeMode() {
		System.out.println("changeMode");
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%d, %d지점으로 이동\n",x,y);
		
	}

}
