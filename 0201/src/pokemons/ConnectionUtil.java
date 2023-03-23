package pokemons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionUtil {
	public static Statement getStatement() throws Exception{
		
		//1) 드라이버 생성 
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 생성 완료");

		//2) url,user,password
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="test";
		String password = "1111";
		
		//3) Connection객체 생성
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection 생성 완료");
		
		return con.createStatement();
	}
}