package pokemons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.ConnectionUtil;

public class PokemonApp {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Statement stmt = ConnectionUtil.getStatement();
		String sql = "";

		scan.nextLine();
		System.out.println("포켓몬의 이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("포켓몬의 cp를 입력하세요");
		String cp = scan.nextLine();
		System.out.println("포켓몬의 키를 입력하세요");
		String height = scan.nextLine();
		System.out.println("포켓몬의 몸무게를 입력하세요");
		String weight = scan.nextLine();

		sql = "INSERT INTO pokemons(no, name, cp, height, weight, catch_date)" + "VALUES(pokemons_seq.nextval,'" + name
				+ "', " + cp + ", " + height + ", " + weight + ", sysdate)";
		stmt.executeUpdate(sql);
	}
}
