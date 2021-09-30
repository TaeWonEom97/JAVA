package inheritance;

public class BonusPointAccount extends Account2{
	private int bonusPoint;
	
	public BonusPointAccount(String accountnum, int money, 
			String name,int bonusPoint) {
		super(accountnum, money, name);
		this.bonusPoint=bonusPoint;
	}
	
	@Override
	void input(int inputmoney) {
		super.input(inputmoney);
//		setMoney(getMoney()+(int)((getMoney()+inputmoney)*0.001));
		bonusPoint+=inputmoney*0.001;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
		
	}
	
}
