package type;

public class BooleanEx {
	boolean b; // 멤버필드;
	
	public static void main(String args[]){
		
		/*
		 * boolean : true, false값
		 * 기본값 : false
		 */
		
		
		//boolean형 자료를 담을 수 있는
		//(지역)변수 b를 선언
		boolean b;
	
		//변수b에 false값을 대입
		b = false;
		
		//변수 b에 true값을 대입
		b = true;
		
		
		//boolean자료를 담을 수 있는
		//변수 c를 선언하고 값을
		//false로 대입(초기화)
		boolean c = false;
		
		//변수 c의 값(false)을
		//변수 b로 대입
		b = c;
		
		//콘솔에 출력
		System.out.println(b);
		
	}//main() end
}//BooleanEx class end