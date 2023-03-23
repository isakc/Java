package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 아이돌이름을 입력하세요");
		String name = scan.nextLine();
		
		SqlSession session = SqlSessionUtil.getSqlSession();
		int result = session.delete("idols.delete",name);
		System.out.println(result+"명이 지워졌습니다.");
	}//main() end
}//Ex3 end
