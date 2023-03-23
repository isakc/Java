package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수정할 그룹번호 입력");
		int num = scan.nextInt();
		scan.nextLine();

		System.out.println("수정할 이름을 입력");
		String name = scan.nextLine();

		SqlSession session = SqlSessionUtil.getSqlSession();

		Group group = new Group(num, name);
		
		int result = session.update("groups.update", group);

		System.out.println(result + "개의 그룹이 수정완료");
	}// main() end

}// Ex4 end
