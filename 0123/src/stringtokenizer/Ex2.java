package stringtokenizer;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신이 좋아하는 배우들을 입력");
		System.out.println("예)공유/이동욱/조인성/김고은");

		String actorNames = scan.nextLine();
		StringTokenizer st = new StringTokenizer(actorNames, "/");
			
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println("배우의 이름은 " + name);
		}
	}// main() end
}// Ex2 class end
