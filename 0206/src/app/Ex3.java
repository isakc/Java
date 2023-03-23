package app;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex3 {

	public static void main(String[] args) {
	SqlSession session = SqlSessionUtil.getSqlSession();
	
	Map<String, String> map = new HashMap<>();

	map.put("new", "남윤명");
	map.put("old", "ㅋㅋㅋ");
	
	int result = session.update("phonebook.updateByName",map);
	
	System.out.println(result);
	
	session.close();
	}//main() end

}//
