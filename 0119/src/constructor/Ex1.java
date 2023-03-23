package constructor;

public class Ex1 {
	
	/* 
	* 생성자는 (기본적으로는)
	* 멤버필드의 초기화
	*  
	* 생성자 선언
	* 접근제한자 클래스명() {}
	*
	* 인자가 없는 생성자 : 기본생성자
	* 
	* 프로그래머가 단 한개의 생성자라도
	* 선언하지 않으면 컴파일러가
	* 컴파일 시 기본생성자를 하나
	* 선언해줍니다.
	*  
	*/
	
	public static void main(String[] args) {
	
		Ex1 e = new Ex1();
		//Ex1 클래스를 가지고 만들어진 객체 레퍼런스를 
		//담을 수 있는 지역변수 e를 선언하고 객체를 생성하여 
		//그 객체의 레퍼런스를 e에 대입(초기화)
		
	}//main() end
}//Ex1 class end
