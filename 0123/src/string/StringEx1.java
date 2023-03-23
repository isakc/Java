package string;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String s = "가나다라마바사";
		
		String s2 = new String("가나다라마바사");
		
		/*
		 * API란 객체가 가지고 있는 
		 * 메소드 사용법
		 * 
		 * 1) 이름
		 * 2) 의미
		 * 3) 리턴자료형
		 * 4) 인자
		 */
		
		/*
		 * 이름 : charAt
		 * 리턴자료형 : char형(문자 1개)
		 * 인자 : 인덱스 숫자
		 * 의미 : 문자열안의 인덱스에 해당하는
		 *        문자하나를 리턴해주는 메소드
		 */
		
		char c = s.charAt(0);
		System.out.println(c);
		
		
		
		/*
		 * 이름 : contains
		 * 인자 : 문자열
		 * 리턴자료형 : true / false
		 * 의미 : 인자로 넣은 문자열을
		 *        가지고 있으면 true,
		 *        없으면 false를 리턴
		 */
		
		boolean b = s.contains("");
		System.out.println(b);
		
		
		
		/*
		 * 이름 : indexOf
		 * 인자 : 문자열
		 * 리턴자료형 : index(정수)
		 * 의미 : 우리가 입력한 문자열이
		 *        몇번째 index인지 알게 해주는 메소드
		 */
		
		s="Hello Java";
		int index = s.indexOf("J");
		System.out.println(index);
		
		
		
		/*
		 * 이름 : substring
		 * 인자 : 1개 or 2개
		 * 리턴자료형 : 문자열
		 * 의미 : 인자로 받은 인덱스부터
		 *        인덱스까지 문자열로 얻음
		 */
		
		s = "ABCDEFGHIJKLMN";

		//인자 1개면 그 index부터 끝까지
		//String sub = s.substring(4);
		//첫번째 인자부터 마지막 인자의 -1번지까지
		String sub = s.substring(0, 3);
		System.out.println(sub);
		
		
		String movieName = "라라랜드";
		//String의 메소드들은(substring)
		//원본은 그대로 두고 자르거나
		//변경된 문자열을 리턴으로
		movieName.substring(0, 2);
		
		System.out.println(movieName);
	}//main() end
}//StringEx1 class end
