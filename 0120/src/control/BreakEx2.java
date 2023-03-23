package control;

import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * for : 반복되는 숫자가 명확할 때 while : 반복되는 숫자가 명확하지 않을 때
		 * 
		 */

		while (true) {
			System.out.println("비밀번호를 입력하세요");

			String pwd = scan.nextLine();

			// 비밀번호가 1234라면
			if (pwd.equals("1234")) {
				break;
			}
		} // while() end

		System.out.println("환영합니다");
	}// main() end
}// BreakEx2 class end
