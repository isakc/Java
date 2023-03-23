package oop;

public class Ex{
	
	int a = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Ex클래스를 가지고 만들어진
		 * 인스턴스를 담을 수 있는
		 * 지역변수 e 선언하고
		 * new라는 키워드로 heap메모리의
		 * 영역을 할당받고(1차 레퍼런스)
		 * Ex클래스의 기본 생성자를 호출하여
		 * 인스턴스를 생성한 후 그 레퍼런스를
		 * e에 대입
		 */
		
		Object e = new Object();

		Object a = new Ex();
		
		/*
		 * equals 메소드 : '==' 동일
		 */
		e.equals(a);
		/*
		 * toString메소드 : 
		 * 패키지.클래스@해쉬코드16진수
		 */
		
		String s = e.toString();

		StringBuilder sb = new StringBuilder("Hello");
		s = sb.toString();
		
		System.out.println(s);
		
	}//main() end
}//Ex class end
