package interfaceTest;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql Dao���� �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql Dao���� ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySql Dao���� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql Dao���� ����");
		
	}

}
