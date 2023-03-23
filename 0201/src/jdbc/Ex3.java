package jdbc;

import java.sql.*;
public class Ex3 {

	public static void main(String[] args) throws Exception{

		//1) 드라이버 로딩
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
		
		//5) SQL작성
		String sql = "INSERT INTO idols(idol_id, name, birth_date, height, weight, group_id)"
		            +"VALUES(idols_seq.nextval, 'GD','1988-8-18', 177 , 58 , 5)";
		
		//6) 구문수행후 결과
		int result = stmt.executeUpdate(sql);
		
		System.out.println(result + "명이 추가되었습니다");
		
	}//main() end
}//Ex3 class end
