package abstractTest;

public class Marine extends Unit{


	void stimPack() {
		System.out.println("����");
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%d, %d�������� �̵�\n",x,y);
	}

}
