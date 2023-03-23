package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3 {

	public static void main(String[] args) {

		// url, user, password
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";

		// sql
		String sql = "SELECT name, height, weight " + "FROM idols";

		// 필요한 지역변수
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString(1);
				int height = rs.getInt(2);
				int weight = rs.getInt(3);

				System.out.print("이름 :" + name);
				System.out.print(" / 키:" + height);
				System.out.println(" / 몸무게:" + weight);
			}//while end
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} // try~ catch end
			} // if end

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} // try~ catch end
			} // if end

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} // try~ catch end
			} // if end
			
		} // try~ catch~ finally end

	}// main() end

}// Ex3
