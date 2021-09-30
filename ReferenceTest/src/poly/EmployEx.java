package poly;

public class EmployEx {

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setName("엄태원");
		e1.setPosition("사원");
		Worker.work(e1);
		
		Ceo ceo = new Ceo();
		ceo.setName("이다희");
		ceo.setPosition("사장");
		Worker.work(ceo);
		
		Manager manager = new Manager();
		manager.setName("태연");
		manager.setPosition("관리자");
		Worker.work(manager);
		
		PartTime parttime = new PartTime();
		parttime.setName("다솜");
		parttime.setPosition("아르바이트");
		Worker.work(parttime);
	}

}
