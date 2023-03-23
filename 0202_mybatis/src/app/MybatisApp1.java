package app;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.Pokemon;

public class MybatisApp1 {
 
	public static void main(String[] args) throws Exception{
		
		//mybatis-config.xml 파일을 읽어오기 위해서
		Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
		
		//SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

		//Sqlsession
		SqlSession session = factory.openSession(true);
		
		/*
		 * Sqlsession의 메소드
		 * - insert
		 * - update
		 * - delete
		 * - selectOne
		 * - selectList
		 */
		
		Pokemon p = new Pokemon("피카츄", 999, 100, 5);
		
		//(namespace.id)
		int result = session.insert("pokemons.insert",p);
		System.out.println(result+"개 입력");
		
	}//main() end
}//MybatisApp1 end
