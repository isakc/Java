package exception;

public class Ex1 {

	private int a;
	
	public static void main(String[] args) {

		Ex1 e = new Ex1();
		e=null;
		//null이 참조된 변수.멤버필드(메소드)
		//NullPointerException
		//e.a = 10;
		
		
		int[] iArr = {3,4,5,6};
		
		//배열의 index를 벗어난 정수를 넣을 경우
		//ArrayIndexOutOfBoundException
		//iArr[4] = 5;
		

		//숫자형식이 아닌 문자열을 넣었을 경우
		//NumberFormatException
		//int i = Integer.parseInt("A");
		//System.out.println(i);
		
		
	}//main() end
}//Ex1 end
