package classTest;

public class SubscriberInfo {
	private String name;
	private String id;
	private String pw;
	private String num;
	private String add;
	
	public SubscriberInfo(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	public SubscriberInfo(String name, String id, String pw, String num, String add) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.num = num;
		this.add = add;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
}
