package util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	
	//이 메소드를 호출하면 SqlSession객체를
	//넘겨줍니다.
	public static SqlSession getSqlSession(){
		
		//제일 윗줄에 리턴자료형 지역변수
		//및 초기화
		SqlSession session = null;
		
		try{
			Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
			
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			
			session = factory.openSession(true);
			
		}catch(Exception e){
			//디버깅 처리
			e.printStackTrace();
		}//try~ catch end
		
		return session;
	}//getSqlsession() end
}//SqlSessionUtil end
