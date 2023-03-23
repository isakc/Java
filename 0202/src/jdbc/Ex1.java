package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Ex1 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="test";
		String password = "1111";
		
		Connection con = null;
		Statement stmt = null;
		int result = 0;
		
		String sql = "INSERT INTO pokemons(no, name, cp, height, weight, catch_date)"
				    +"VALUES(pokemons_seq.nextval, '야돈', 13, 1.15, 35.34, sysdate)";
		
		try{ //try구문 안에는 코딩을 최소
			//JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		}catch(Exception e){
			//Exception 설명 출력
			e.printStackTrace();
		}finally{
			
			try {
				if(stmt!=null){
					stmt.close();	
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}//try~catch
			
			try {
				if(con!=null){
					con.close();	
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}//try~catch
			
		}//try~ catch~ finally end
		
		System.out.println(result+"개 포켓몬 입력!");
		
	}//main() end
}//Ex1 end
