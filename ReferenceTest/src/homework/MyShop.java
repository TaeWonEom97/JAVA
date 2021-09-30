package homework;

import java.util.Scanner;

public class MyShop implements Ishop {
	private String title;
	private Scanner k = new Scanner(System.in);
	private Product[] carts = new Product[10];
	private String selUser;
	private User users[] = new User[2];
	private Product products[] = new Product[5];

	public MyShop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setTitle(String title) {

	}

	public void genUser() {
		users[0] = new User("엄태원", PayType.CARD);
		users[1] = new User("엄택원", PayType.CASH);
	}

	public void genProduct() {
		products[0] = new SmartTV("삼성", 1000, "skt");
		products[1] = new SmartTV("LG", 2000, "kt");
		products[2] = new CellPhone("아이폰12", 500, "Lg u+");
		products[3] = new CellPhone("아이폰XS", 400, "dd");
		products[4] = new CellPhone("갤럭시", 100, "tt");
	}

	public void productList() {
		System.out.println(title + " : 상품목록 - 상품선택");
		System.out.println("================================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		String key = k.next();
		switch (key) {
		case "h": {
			start();
			break;
		}
		case "c": {
			checkOut();
			break;
		}
		default: {
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(key)];
					break;
				}
			}
			productList();
			break;
		}
		}
	}

	public void checkOut() {
		int sum = 0;
		System.out.println("## c선택 ##");
		System.out.println(title + " : 체크 아웃");
		System.out.println("===================================");
		for (int i = 0; i < carts.length; i++) {
			System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
		sum += carts[i].getPrice();
		}
		System.out.println("===================================");
		System.out.println("결재 방법 : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : " + sum + "원 입니다.");
		System.out.println("[p] 이전, [q] 결재완료");
		System.out.print("선택 : ");
		String input = k.next();
		switch (input) {
		case "p": {
			productList();
			break;
		}
		case "q": {
			System.out.println("결재완료 되었습니다. 감사합니다.");
			break;
		}
		}
	}

	@Override
	public void start() {

		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("================================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("종 료");
		System.out.print("선택 : ");
		String key = k.next();
		System.out.println("##" + key + "선택 ##");
		switch (key) {
		case "0", "1": {
			selUser = key;
			productList();
			break;
		}
		case "x": {
			System.out.println("종료");
			System.exit(0);

		}
		}
	}

}
