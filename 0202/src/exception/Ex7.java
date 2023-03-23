package exception;

public class Ex7 {
	public static void main(String[] args) {
		
		/*
		 * RuntimeException을 상속받는 예외는
		 * try~ catch를 안해도 사용가능
		 * 
		 * 위를 제외한 예외는 반드시 처리해야 합니다.
		 * 
		 */
		
		throw new RuntimeException();
		
	}//main() end
}//Ex7 end
