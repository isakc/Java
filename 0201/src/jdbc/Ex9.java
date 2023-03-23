package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 글자를 입력하시오");
		String text = scan.nextLine();
		
		Statement stmt = ConnectionUtil.getStatement();
		
		String sql = "SELECT name, height, weight"
				  + " FROM idols"
				  + " WHERE name LIKE '%"+text+"%'";
		
		ResultSet rs = stmt.executeQuery(sql);
		

		if(rs.next()){
			//do~while문 : 한번은 무조건 작동이 됨
			do{
				String name = rs.getString(1);
				int height = rs.getInt(2);
				int weight = rs.getInt(3);
				System.out.print("이름: "+name);
				System.out.print(" / 키:" + height);
				System.out.println(" / 몸무게:"+ weight);
			}while(rs.next()); //do while() end
			
		}else{
			System.out.println("'"+text+"' 이 들어간 이름은 없습니다");
		}//if~else end
		
		
//		while(rs.next()){
//			String name = rs.getString(1);
//			int height = rs.getInt(2);
//			int weight = rs.getInt(3);
//			System.out.print("이름: "+name);
//			System.out.print(" / 키:" + height);
//			System.out.println(" / 몸무게:"+ weight);
//		}//while end
	}//main() end
}//Ex9 class end
