package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class test {
	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSqlSession();
		
		List<Group> list = session.selectList("groups.selectList");
		
		for(Group g : list){
			System.out.println(g);
		}
	}
}
