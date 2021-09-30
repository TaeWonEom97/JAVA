package abstractTest;

public class DropShip extends Unit{
	
	void load() {
		System.out.println("load");
	}
	
	void upload() {
		System.out.println("upload");
	}

	@Override
	void move(int x, int y) {
		System.out.printf("%d, %d지점으로 이동\n",x,y);
		
	}

}
