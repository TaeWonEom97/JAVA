package abstractTest;

public class Marine extends Unit{


	void stimPack() {
		System.out.println("스팀");
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%d, %d지점으로 이동\n",x,y);
	}

}
