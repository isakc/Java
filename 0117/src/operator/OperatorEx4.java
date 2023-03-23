package operator;

public class OperatorEx4 {
	public static void main(String[] args) {
	
		/*
		 * 논리연산자(피연산자 : 논리값)
		 * - && : 논리곱
		 * - || : 논리합
		 * 
		 * 논리연산자는 논리값이 중요하니깐
		 * &&의 경우 앞항이 false면 뒤를 실행안함
		 * ||의 경우 앞항이 true면 뒤를 실행안함
		 * 
		 * 
		 * 
		 * 비트연산자
		 * - & : 앞항이 false라도 뒤를 실행함
		 * - | : 앞항이 true라도 뒤를 실행함
		 */

		int a = 4;
		int b = 3;
		if(a==b && ++a == b){
			System.out.println(a);
		}else{
			System.out.println(a);
		}
		
		//System.out.println(true&true);
		
		//System.out.println(true||true);
		
	}//main() end
}//OperatorEx4 class end