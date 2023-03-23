package app;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.Pokemon;

public class MybatisApp3 {
 
	public static void main(String[] args) throws Exception{
		
		//mybatis-config.xml 파일을 읽어오기 위해서
		Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
		
		//SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

		//Sqlsession
		SqlSession session = factory.openSession(true);

		Pokemon pokemon = new Pokemon( 9,"라이츄");
		
		//(namespace.id)
		int result = session.update("pokemons.update", pokemon);
		
		System.out.println(result +"개가 바뀌었습니다");
	}//main() end

}//MybatisApp2 end