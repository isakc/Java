package exception;

public class Ex4 {
	public static void main(String[] args) {
		
		System.out.println(1);

		/*
		 * try~ catch~ finally
		 * 
		 * finally 구문은 에러 발생여부와 상관없이 작동
		 * 
		 */

		try{
			System.out.println(2);
			System.out.println(5/0);
			System.out.println(3);
		}catch(Exception e){
			System.out.println(4);
		}finally{
			System.out.println(5);
		}//try~ catch~ finally end
		
		System.out.println(6);
		
	}//main() end
}//Ex4 end
