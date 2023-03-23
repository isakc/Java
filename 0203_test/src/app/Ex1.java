package app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		SqlSession session = SqlSessionUtil.getSqlSession();
		
		System.out.println("그룹명을 입력해주세요");
		String name = scan.nextLine();

		System.out.println("소속사를 입력해주세요");
		String agent = scan.nextLine();
		
		System.out.println("데뷔일을 입력해주세요");
		System.out.println("ex) 2017-02-03");
		String date = scan.nextLine();
		Date debutDate = Date.valueOf(date);

		Group group = new Group(name, agent, debutDate);

		int result = session.insert("groups.insert", group);

		System.out.println(result + "개의 그룹이 등록되었습니다.");

	}// main() end
}// MybatisApp1 end