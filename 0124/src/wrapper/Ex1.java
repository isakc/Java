package wrapper;

public class Ex1 {
	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스
		 * Boolean, Byte, Short, Integer,
		 * Float, Double, Long, Character
		 * 
		 * 기본자료형을 객체자료형처럼
		 * 사용하고 싶을 때 쓰는 클래스
		 * 
		 * 기본자료형에 필요한 메소드때문에
		 */
		
		//생성자 : String or 기본자료형들
		Boolean b = new Boolean(false);
		//Boolean은 TRUE(대소문자 상관없이)
		//빼고 다 false
		Boolean b2 = new Boolean("TEST");
		
		b = new Boolean("false");
		
		System.out.println(b2);
		
		Integer i = new Integer(5);
		Integer i2 = new Integer("5");
		System.out.println(i2);
		
		//상수
		System.out.println(Integer.MAX_VALUE);
		
		//문자열을 int형으로 바꾸는 메소드
		int num = Integer.parseInt("456");
		System.out.println(num);
		
	}//main() end
}//Ex1 class end
