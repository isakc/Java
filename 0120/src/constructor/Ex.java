package constructor;

public class Ex {
	
	//메소드는 코딩을 안하면
	//아무일도 안함
	void test() {
		
	}
	
	//생성자는 코딩을 안해도
	//객체를 생성합니다.
	
	public Ex() {
		//생성자 첫번째라인에서 객체 생성
		//되는데 this()즉 다른 생성자를
		//호출할 경우 여기에서는 객체가
		//만들어지지 않습니다.
		this(3);
		System.out.println("SSSsss");
	}
	
	public Ex(int a){
		//여기에서 객체 생성
		System.out.println("BloodTrail");
	}
	
	public static void main(String[] args) {

		Ex e;
		// Ex클래스를 가지고 만들어진
		// 객체의 레퍼런스를 담을 수 있는
		// 변수 e를 선언

		e = new Ex();
		// new라는 키워드를 통해서
		// heap메모리영역에 공간을 할당받고
		// (레퍼런스)
		// Ex클래스의 기본생성자를 호출하여
		// 객체를 생성한 후
		// 그 레퍼런스를 e에 대입(초기화)

	}// main() end
}// Ex class end