package stringtokenizer;

import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) {

		String twice = "쯔위,사나,모모,나연,정연";

		/*
		 * 문자열을 특정문자열로 잘라서 얻어 올 수 있는 클래스 StringTokenizer
		 */

		StringTokenizer stok = new StringTokenizer(twice, ",");

		while (stok.hasMoreTokens()) {
			String name = stok.nextToken();
			System.out.println("이름은 : " + name);
		}
		
	}// main() end
}// Ex1 class end
