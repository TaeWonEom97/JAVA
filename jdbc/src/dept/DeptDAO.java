package dept;

import java.sql.Connection;
import java.sql.DriverManager;

public class DeptDAO {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@EOMTAEWON:1522:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
