package ex;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Movie;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		System.out.println("검색할 영화제목을 입력해주세요.");
		String name = scan.nextLine();
		
		List<Movie> list =session.selectList("movies.selectByName", name);

		if(!list.isEmpty()){
			for(Movie movie : list){
				System.out.println(movie);
			}//for end

		}else{
			System.out.println("검색된 영화가 없습니다.");
		}//if~else end
		
		scan.close();
	}//main() end
}//Ex14 end
