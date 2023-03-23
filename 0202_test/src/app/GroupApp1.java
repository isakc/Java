package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GroupApp1 {

	public static void main(String[] args) throws Exception{
		
		//mybatis-config.xml 파일을 읽어오기 위해서
				Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
				
				//SqlSessionFactory
				SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

				//Sqlsession
				SqlSession session = factory.openSession(true);

				//(namespace.id)
				int result = session.delete("groups.delete", 8);
				
				System.out.println(result +"개가 지워졌습니다");
				
	} //main() end

}//GroupApp1 end
