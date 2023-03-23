package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Phone;

public class Ex2 {
	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		List<Phone> list = session.selectList("phonebook.selectList");
		
		for(Phone p : list){
			System.out.println(p);
		}//for end
		
	}//main
}//Ex2 end
