package abstractTest;

public class Tank extends Unit{


	void changeMode() {
		System.out.println("changeMode");
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%d, %d�������� �̵�\n",x,y);
		
	}

}
