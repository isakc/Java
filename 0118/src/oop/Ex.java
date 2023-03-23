package oop;

public class Ex {
	
	//접근제한자가 default이고
	//기본자료형 int형인 인스턴스 멤버필드 a
	int a;
	
	//접근제한자가 default이고
	//기본자료형 int형인 스테틱멤버필드 b
	static int b;
	
	public static void main(String[] args) {
		
		//스태틱에 접근할 때는
		//클래스명.
		Ex.b = 7;
		Ex a = new Ex();
		a.a = 5;
		a.b = a.a;
		
		System.out.println(Ex.b);
		
	}//main() end
}//Ex class end
