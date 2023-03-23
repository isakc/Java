package type;

public class CharEx {
	public static void main(String args[]){
		/*
		 * 문자형 : char형 ''(한글자)
		 * 
		 * 기본값 : \u0000
		 * 
		 * 크기 : 2byte (0~65535) : 유니코드
		 * 
		 * 0 : 48
		 * 1 : 49
		 * A : 65
		 * a : 97
		 * \r\n <=엔터, \t < = tab키
		 * 
		 * \u0000 <--- unicode를 16진수로
		 * 
		 * 문자열형 : String형
		 */
		
		//기본자료형 char형 변수 c를 선언
		//문자 a를 대입 (초기화)
		char c = 'c';
		
		//char형은 내부적으로 정수처리
		c = 'b';
		
		c = '\t'; 
		
		c = '\u0043'; //67(10진수) C
        
		//int a = c-3;
		
		//String형 변수 s를 선언
		//문자열 C를 대입 (초기화)
		
		String s = "C";
		
		byte b =1;
		short sh = 2;
		int i = 3;
		long l = 4l;
		
		
		System.out.println(c);
	}
}