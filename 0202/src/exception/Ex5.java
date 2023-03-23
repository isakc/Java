package exception;

public class Ex5 {

	public static void main(String[] args) {
		
		/*
		 * catch구문이 여러개일 때
		 * 상속관계에 있는 Exception들은
		 * 자식이 위로, 부모가 아래로
		 * 
		 */
		
		try{
			System.out.println(5/0);
		}catch(ArithmeticException e){
			System.out.println("A");
		}catch(RuntimeException e){
			System.out.println("R");
		}catch(Exception e){
			System.out.println("E");
		}finally{
			System.out.println("F");
		}
		System.out.println("후후");

	}//main() end
}//Ex5 end
