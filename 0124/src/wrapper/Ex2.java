package wrapper;

public class Ex2 {
	
	Integer i;
	
	public static void main(String[] args) {
		
		Ex2 e = new Ex2();
		
		//자바 5부터 추가된 개념
		//편리함을 위해서
		Integer i = 5;//오토박싱
		
		int j = i;//언박싱
		
		System.out.println(e.i);
	}//main() end
	
}//Ex2 class end
