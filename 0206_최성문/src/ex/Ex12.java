package ex;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Genre;

public class Ex12 {
	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		List<Genre> list = new ArrayList<>();
		
		list = session.selectList("genres.selectList");
		
		for(Genre genre : list){
			System.out.println(genre);
		}//for end
	}//main() end
}//Ex12 end
