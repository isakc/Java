package stringbuilder;

import java.util.logging.Logger;

public class BuilderEx1 {
	public static void main(String[] args) {
		
		/*
		 * String은 편집이 불가
		 * 
		 * String을 이용해서 문자열을
		 * 합치면 객체가 계속 만들어져서
		 * 비효율적입니다.
		 * 
		 * 편집이 가능한 클래스
		 * 1) StringBuffer JDK1.0부터
		 * 2) StringBuilder JKD 5부터
		 */
		
		String s = "가";
		s+="나";
		s+="다";
		
		StringBuilder sb = new StringBuilder("가");
		//기존의 문자열에 추가하는 메소드
		sb.append("나");
		sb.append("다");
		
		//StringBuilder를 string으로
		String str = sb.toString();

		//출력
		System.out.println(str);
		
	}//main() end
}//BuilderEx1 class end
