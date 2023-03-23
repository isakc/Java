package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		System.out.println("변경할 장르명을 입력하세요");
		String oldName = scan.nextLine();
		map.put("old",oldName);
		
		System.out.println("변경될 장르명을 입력하세요.");
		String newName = scan.nextLine();
		map.put("new", newName);
		
		int result = session.update("genres.updateByName",map);
		System.out.println(result+"개의 장르명이 잘 변경되었습니다.");
		
		
		scan.close();
	}//main end

}//Ex10 end
