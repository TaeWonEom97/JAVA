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
		users[0] = new User("���¿�", PayType.CARD);
		users[1] = new User("���ÿ�", PayType.CASH);
	}

	public void genProduct() {
		products[0] = new SmartTV("�Ｚ", 1000, "skt");
		products[1] = new SmartTV("LG", 2000, "kt");
		products[2] = new CellPhone("������12", 500, "Lg u+");
		products[3] = new CellPhone("������XS", 400, "dd");
		products[4] = new CellPhone("������", 100, "tt");
	}

	public void productList() {
		System.out.println(title + " : ��ǰ��� - ��ǰ����");
		System.out.println("================================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.println("���� : ");
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
		System.out.println("## c���� ##");
		System.out.println(title + " : üũ �ƿ�");
		System.out.println("===================================");
		for (int i = 0; i < carts.length; i++) {
			System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
		sum += carts[i].getPrice();
		}
		System.out.println("===================================");
		System.out.println("���� ��� : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("�հ� : " + sum + "�� �Դϴ�.");
		System.out.println("[p] ����, [q] ����Ϸ�");
		System.out.print("���� : ");
		String input = k.next();
		switch (input) {
		case "p": {
			productList();
			break;
		}
		case "q": {
			System.out.println("����Ϸ� �Ǿ����ϴ�. �����մϴ�.");
			break;
		}
		}
	}

	@Override
	public void start() {

		System.out.println(title + " : ����ȭ�� - ��������");
		System.out.println("================================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("�� ��");
		System.out.print("���� : ");
		String key = k.next();
		System.out.println("##" + key + "���� ##");
		switch (key) {
		case "0", "1": {
			selUser = key;
			productList();
			break;
		}
		case "x": {
			System.out.println("����");
			System.exit(0);

		}
		}
	}

}
