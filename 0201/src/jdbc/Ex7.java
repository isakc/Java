package jdbc;

import java.sql.*;
import java.sql.Date;

public class Ex7 {

	public static void main(String[] args) throws Exception{
		Statement stmt = ConnectionUtil.getStatement();
		
		String sql = 
				  "SELECT idol_id, name, birth_date, height, "
				+ "weight, group_id "
				+ "FROM idols ";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			int idolId = rs.getInt(1);
			String name = rs.getString(2);
			Date birth = rs.getDate(3);
			int height = rs.getInt(4);
			int weight = rs.getInt(5);
			int groupId = rs.getInt(6);
			
			System.out.print("아이돌 번호:"+idolId);
			System.out.print(" / 이름:"+name);
			System.out.print(" / 생일:"+birth);
			System.out.print(" / 키:"+height +"cm");
			System.out.print(" / 몸무게:"+weight+"kg");
			System.out.println(" / 그룹 번호:"+groupId);
		}//while end
		
	}//main() end

}//Ex7 class end