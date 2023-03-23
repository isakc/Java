package jdbc;

import java.sql.*;
import java.sql.Date;

public class Ex8 {

	public static void main(String[] args) throws Exception{
		Statement stmt = ConnectionUtil.getStatement();
		
		String sql = 
				  "SELECT i.idol_id, i.name, i.birth_date, i.height, "
				+ "i.weight, g.name "
				+ "FROM idols i,groups g "
				+ "WHERE i.group_id = g.group_id";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			int idolId = rs.getInt(1);
			String name = rs.getString(2);
			Date birth = rs.getDate(3);
			int height = rs.getInt(4);
			int weight = rs.getInt(5);
			String group_name = rs.getString(6);
			
			System.out.print("아이돌 번호:"+idolId);
			System.out.print(" / 이름:"+name);
			System.out.print(" / 생일:"+birth);
			System.out.print(" / 키:"+height +"cm");
			System.out.print(" / 몸무게:"+weight+"kg");
			System.out.println(" / 그룹명:"+group_name);
		}//while end
		
	}//main() end

}//Ex7 class end