package poly;

public class EmployEx {

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setName("���¿�");
		e1.setPosition("���");
		Worker.work(e1);
		
		Ceo ceo = new Ceo();
		ceo.setName("�̴���");
		ceo.setPosition("����");
		Worker.work(ceo);
		
		Manager manager = new Manager();
		manager.setName("�¿�");
		manager.setPosition("������");
		Worker.work(manager);
		
		PartTime parttime = new PartTime();
		parttime.setName("�ټ�");
		parttime.setPosition("�Ƹ�����Ʈ");
		Worker.work(parttime);
	}

}
