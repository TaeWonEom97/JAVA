package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@EOMTAEWON:1522:xe";
			String user = "c##scott";
			String password = "tiger";

			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				System.out.println("연결되었습니다.");

				// sql 구문을 작성 -> emp의 모든 데이터 조회
				String sql = "SELECT *FROM emp";

				// sql 구문을 데이터 베이스 서버로 전송
				pstmt = con.prepareStatement(sql);

				// sql 구문이 실행된 결과를 받아오기
				rs = pstmt.executeQuery();

				// sql 결과를 화면에 출력
				System.out.println("empno\tename\tjob\t\tmgr\thiredate\t\tsal\tcomm\tdeptno");
				while (rs.next()) { // Resultset객체 안에 읽어올 내용이 있으면 true
					System.out.print(rs.getString("empno")+"\t");
					System.out.print(rs.getString("ename")+"\t");
					System.out.print(rs.getString("job")+"\t\t");
					System.out.print(rs.getString("mgr")+"\t");
					System.out.print(rs.getString("hiredate")+"\t");
					System.out.print(rs.getInt("sal")+"\t");
					System.out.print(rs.getInt("comm")+"\t");
					System.out.println(rs.getInt("deptno"));
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
