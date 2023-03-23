package ex;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SqlSession session = SqlSessionUtil.getSqlSession();
		System.out.println("추가할 장르를 입력하세요.");
		String name = scan.nextLine();
		
		int result = session.insert("genres.insert",name);
		System.out.println(result+"개의 장르가 입력되었습니다.");
		
		scan.close();
		session.close();
	}//main end
}//Ex09 end
