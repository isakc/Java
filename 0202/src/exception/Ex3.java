package exception;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println(1);
		
		try{
			System.out.println(2);
			System.out.println(5/0);
			System.out.println(3);
		}catch(Exception e){
			System.out.println(4);
		}//try~ catch end
		
		System.out.println(5);
	}//main() end

}//Ex3 end
