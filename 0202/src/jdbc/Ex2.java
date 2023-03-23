package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex2 {

	public static void main(String[] args) {
		
		//필요한 변수 선언 및 초기화
		
		Statement stmt=null;
		Connection con=null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		String sql = "INSERT INTO groups(group_id, name, agent, debut_date)"
				    +"VALUES(groups_seq.nextval, '소녀시대', 'SM엔터테인먼트', '2007-08-02')";
		
		int result = 0;
		
		//2) try~ catch~ finally
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			
			con = DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			
			result = stmt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			try {
				if(stmt!=null){
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}//try~ catch end
			
			try {
				if(con!=null){
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}//try~ catch end
		}//try~ catch~ finally end
		
		System.out.println(result+"개 그룹 입력!");
		

	}// main() end

}// Ex2 end
