package mavenweb;

import java.sql.*;

public class MariaDBTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "root", "a9480529");
		Statement stat = conn.createStatement();
		
		ResultSet rs = stat.executeQuery("select * from test1;");
		
		while(rs.next()) {
			System.out.println("============================");
			System.out.println("NAME : " + rs.getString("NAME"));
			System.out.println("CONTENT : " + rs.getString("NUM"));
		}
		System.out.println("============================");
		rs.close();
		conn.close();
	}
}
