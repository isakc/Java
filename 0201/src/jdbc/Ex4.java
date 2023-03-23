package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름을 입력하세요");
		String name = scan.nextLine();
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 생성 완료");

		//2) url,user,password
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="test";
		String password = "1111";
		
		//3) Connection객체 생성
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("커넥션 생성 완료");
		
		//4) Statement객체 생성
		Statement stmt = con.createStatement();
		System.out.println("구문객체 생성 완료");
		
		//5) SQL실행
		String sql = "DELETE idols WHERE name = '" + name + "'";
		
		stmt.executeUpdate(sql);
		System.out.println(name + " 삭제 완료");
		
	}//main() end

}//Ex4 class end
