package string;

public class Ex1 {

	public static void main(String[] args) {

		Ex1 e = new Ex1();
		Ex1 a = e;

		/*
		 * 객체생성은 
		 * - 명시적 객체생성(예: new Ex1()) 
		 * - 암시적 객체생성 
		 * 
		 */

		String s = "공유"; //암시적 객체생성
		String s2 = new String("공유"); //명시적 객체생성
		System.out.println(s.equals(s2));
		
			
	}// main() end
}// Ex1 class end
