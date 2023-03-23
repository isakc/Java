package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex2 {
	public static void main(String[] args) throws Exception{
		
		//1) JDBC 드라이버 메모리에 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 로딩 완료");
		
		//2) url, user, pasword를 설정
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="test";
		String password = "1111";
		
		//3) 커넥션 객체 얻어옴
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("커넥션 생성 완료");
		
		//4) 구문객체(Statement) 생성
		Statement stmt = con.createStatement();
		System.out.println("구문객체 생성 완료");
		
		String sql = "INSERT INTO groups(group_id, name, agent, debut_date)"
				   + "VALUES(groups_seq.nextval,'빅뱅','YG엔터테인먼트','2006-8-19')";
		
		//5) 수행
		int result = stmt.executeUpdate(sql);
		
		System.out.println(result+"개의 그룹이 추가되었습니다");
		
	} //main() end
}//Ex2 end
