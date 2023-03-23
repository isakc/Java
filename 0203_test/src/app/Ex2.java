package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex2 {

	public static void main(String[] args) {
		
		//아이돌 전부 출력
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		List<Group> list = session.selectList("groups.selectList");
		
		for(Group group : list){
			System.out.println(group);
		}//for end
		
	}//main() end
}//Ex2 end
