package operator;

public class OperatorEx2 {
	public static void main(String[] args) {
		
		/*
		 * ! 연산자 (1항연산자)
		 * - 논리부정 연산자
		 */
		
		//기본자료형 boolean형 
		//변수 b를 선언
		boolean b;
		
		//변수 b에 true값을 대입(초기화)
		b = true;
		
		//System.out.println(!b);
		
		
		/*
		 *  ++ / -- 증감연산자 (1항연산자)
		 *  변수 앞에 전위
		 *  변수 뒤에 후위
		 *  
		 *  후위연산이 대입연산보다 우선순위 낮음
		 *  
		 *  
		 */
		
		//기본자료형 int형 변수 a를 선언
		//정수 5를 대입(초기화)
		int a = 5;
		int c = 4;

		System.out.println(a++);//5
		System.out.println(a);//6
				
		
	}//main() end
}//OpeartorEx2 class end
