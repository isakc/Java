package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex1 {
	
	public static void main(String[] args) throws Exception {
		
		//1) JDBC 드라이버를 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 로딩 완료");
		
		// 1.5) url과 user와 password 설정
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		
		//2) 커넥션(Connection) 객체 생성(오라클이 만들어서 넘겨줌)
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("커넥션 생성 완료");
		
		//3) 구문객체(Statement) 생성
		Statement stmt = con.createStatement();
		System.out.println("구문객체 생성 완료");
		
		//4) SQL구문 작성
		String sql = "DELETE idols WHERE idol_id = 18";
		
		//5) 수행
		int result = stmt.executeUpdate(sql);
		
		System.out.println(result + "행 수행완료");
	}//main() end
}//Ex1 class end
