package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

import vo.Movie;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SqlSession session = SqlSessionUtil.getSqlSession();

		List<Movie> list = new ArrayList<>();
		
		list = session.selectList("movies.selectList");
		int count =0; //4개씩 출력하기 위한 카운트
		
		for(int i=0; i<list.size(); i++){
	
			System.out.print(list.get(i).getNo()+") " +list.get(i).getName()+"   ");
			count++;
			if(count==4){
				System.out.println("");
				count=0;
			}//if end
		}//for end
		
		System.out.println("삭제할 영화번호는?");
		int no = scan.nextInt();
		int result = session.delete("movies.delete",no);
		System.out.println(result+"개의 영화가 삭제되었습니다.");
		
		scan.close();
	}//main() end

}//Ex13 end
