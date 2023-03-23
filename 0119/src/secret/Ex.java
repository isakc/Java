package secret;

import java.lang.*; //숨겨진 비밀 2번째

public class Ex {
	static int a = 5;
	int b;

	void test() {
		//그 객체의 레퍼런스
		this.b = 1;
		
	}

	public static void main(String[] args) {

		/*
		 * 자바의 숨겨진 비밀
		 * 
		 * 1) static 멤버에 접근시 클래스명. 을 생략가능
		 * 
		 * 2) java.lang 패키지에 있는 클래스들은 import하지 않아도 사용가능
		 * 
		 * 3) instance멤버 접근시 this. 을 생략가능
		 * 
		 * 4) 프로그래머가 단 한개의
		 *    생성자도 선언하지 않으면
		 *    컴파일러가 컴파일시
		 *    기본생성자를 선언해줍니다.
		 */

	}// main() end
}// Ex class end
