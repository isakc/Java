package type;

public class IntEx {
	public static void main(String args[]){		
		/*
		 * int는 자바의 기본정수
		 * int : 4byte
		 */
		
		//기본자료형 int형 변수 i를 선언하고
		//정수 4를 대입(초기화)
		
		int i = 4;
	
		i = 3676;
		
		System.out.println(i);
		
		byte a = 4;
		byte b = 5;
		
		/*
		 * int형보다 작은 short, byte형은 
		 * 계산을 하면 그 결과는 int형으로 리턴
		 * 
		 * int형보다 크면 큰 자료형으로
		 */
		
		int c = a+b;
		
		System.out.println(c);
	}
}