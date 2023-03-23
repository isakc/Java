package method;

public class OverloadingEx {

	private void test(){
		System.out.println("가");
	}
	
	private void test(int a){
		System.out.println("와");
	}
	
	void test(int a, String b){
		System.out.println("int / String");
	}
	
	protected void test(String b, int a){
		System.out.println("String / int");
	}
	
	public static void main(String[] args) {
		
		/*
		 * 오버로딩이란 이름이 같고
		 * 인자가 다른 것
		 *
		 * 인자가 다르다는 것
		 * 1) 인자의 자료형이 다르다.
		 * 2) 인자의 갯수가 다르다.
		 * 3) 인자의 순서가 다르다. 
		 * 
		 */
		
	}//main() end
}//OverloadingEx class end
