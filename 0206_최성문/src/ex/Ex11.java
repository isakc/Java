package ex;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		System.out.println("삭제할 장르를 입력하세요");
		String name = scan.nextLine();
		
		int result = session.delete("genres.delete",name);
		System.out.println(result+"개의 장르가 삭제되었습니다.");
		
		scan.close();
		session.close();
	}//main() end
}//Ex11 end
