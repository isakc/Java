package string;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("당신의 이메일은?");
		System.out.println("예)blazebottle@naver.com");

		// 출력은 당신의 아이디는 blazebottle입니다

		//유저에게 입력받아야 하니깐 Scanner
		Scanner scan = new Scanner(System.in);

		while (true) {
			String email = scan.nextLine();

			if (email.contains("@") && email.contains(".")) {
				//indexOf("@")
				int index = email.indexOf("@");

				//첫번째부터 index까지 잘라서 id에 받음
				String id = email.substring(0, index);

				System.out.println("당신의 아이디는 " + id + "입니다");
				break;
			} else {
				System.out.println("이메일을 다시 입력해주세요");
			}
		}
	}// main() end
}// Ex2 class end
