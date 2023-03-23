package jdbc;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class Ex6 {
	public static void main(String[] args) throws Exception{
		
		Statement stmt = ConnectionUtil.getStatement();
		
		String sql = "SELECT * FROM groups ORDER BY group_id";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		//커서는 맨위에 있고 next는 밑으로 한칸씩 이동
		while(rs.next()){
			int groupId = rs.getInt("group_id");
			String name = rs.getString("name");
			String agent = rs.getString(3);
			Date debut = rs.getDate(4);
			
			System.out.print("번호:" +groupId);
			System.out.print(" / 이름:" +name);
			System.out.print(" / 소속사:" +agent);
			System.out.println(" / 데뷔일:" +debut);
			
		}//while end
		
	}//main() end

}//Ex6 class end
