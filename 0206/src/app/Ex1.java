package app;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Phone;

public class Ex1 {
	public static void main(String[] args) {

		SqlSession session = SqlSessionUtil.getSqlSession();

		Phone phone = new Phone();
		phone.setName("CHOISUNGMOON");
		phone.setAddress("경기도 오산시");
		phone.setPhone("01030770157");
		
		int result = session.insert("phonebook.insert", phone);
		
		System.out.println(result+"개가 입력되었습니다.");
		
		session.close();
	}// main() end
}// Ex1 end