package ex;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Genre;
import vo.Movie;

public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SqlSession session = SqlSessionUtil.getSqlSession();

		System.out.println("★ 영화입력 프로그램 ★");
		List<Genre> list = session.selectList("genres.selectList2");
		int count = 0;
		String date = null;
		Date releaseDate = null;
		Date endDate = null;
		String num =""; //Integer.parseInt를 사용하기 위해 String 값으로 받음
		int audienceNum = 0;
		

		for (Genre genre : list) {
			count++;
			if (count != list.size()) {
				System.out.print(genre.getNo() + ") " + genre.getName() + " / ");
			} else {
				System.out.println(genre.getNo() + ") " + genre.getName());
			}
		}
		int no = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("장르번호를 입력해주세요.^-^");
			no = scan.nextInt();
			scan.nextLine();

			for (int i = 0; i < list.size(); i++) {
				if (no == list.get(i).getNo()) {
					flag = false;
					break;
				} // if end
			} // for end
		} // while end

		System.out.println("영화이름을 입력해주세요.^-^");
		String name = scan.nextLine();

		System.out.println("감독이름을 입력해주세요.^-^");
		String director = scan.nextLine();

		while (true) {

			System.out.println("아래와 같은 포맷으로 개봉일을 입력해주세요.");
			System.out.println("2017-02-03(년-월-일)");

			date = scan.nextLine();

			try {
				releaseDate = Date.valueOf(date);
				break;

			} catch (Exception e) {

			} // try~catch end
		} // while end

		while (true) {
			System.out.println("아래와 같은 포맷으로 종료일을 입력해주세요.");
			System.out.println("2017-02-03(년-월-일)");

			date = scan.nextLine();
			try {
				endDate = Date.valueOf(date);
				break;
			} catch (Exception e) {
				endDate = null;
				break;
			} // try~catch end
		} // while end

		System.out.println("관객수를 입력해주세요.(없으면 그냥 엔터)");

		try {
			num = scan.nextLine();
			audienceNum = Integer.parseInt(num);
		} catch (Exception e) {
			audienceNum=0;
		}// try~ catch end

		Movie movie = new Movie(name, releaseDate, endDate, director, audienceNum, no);
		int result = session.insert("movies.insert", movie);

		System.out.println(result + "개의 영화가 등록되었습니다.");

		scan.close();
	}// main() end
}// Ex15 end
