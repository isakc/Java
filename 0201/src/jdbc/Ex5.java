package jdbc;

import java.util.Scanner;
import java.sql.*;

public class Ex5 {

	public static void main(String[] args) throws Exception{

		Scanner scan = new Scanner(System.in);
		System.out.println("그룹명을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("데뷔일을 입력하세요.");
		System.out.println("ex) 2017-02-01");
		String date = scan.nextLine();
		
		System.out.println("소속사를 입력하세요.");
		String agent = scan.nextLine();
	
		//4) Statement객체 생성
		Statement stmt = ConnectionUtil.getStatement();
		System.out.println("구문객체 생성 완료");
		
		//5) SQL 작성
		String sql = "INSERT INTO groups(group_id, name, agent, debut_date) "
				    +"VALUES(groups_seq.nextval, '"+name+"', '" + agent + "', '" +date +"')";
				
		//수행
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개의 그룹이 입력되었습니다");
		
	}//main() end

}//Ex5 class end
