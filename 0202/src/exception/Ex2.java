package exception;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num; // 선언

		while (true) {
			System.out.println("0~100까지 정수 입력!");
			String str = scan.nextLine();
			
			try {
				//예외발생 가능성 구문
				num = Integer.parseInt(str);
				if(num>=0 && num<=100){
					break;//정수
				}else{
					//0보다 작거나 100보다 큰 수일 경우
					//예외를 강제적으로 발생시킴
					throw new Exception();
				}//if~else end
				
			} catch (Exception e) {
				System.out.println("제대로 된 수를 입력하세요");
			} // try~catch end

		} // while end
		
		if(num>80){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}//if~else end

		/*
		 * 예외처리 1) throws : 예외처리를 안하고 넘겨버리는 경우 2) try~catch 구문
		 * 
		 * 예외가 발생할 만한 코드를 try구문에 넣음 예외가 발생되었을 때 필요한 코드를 catch구문에 넣음
		 * 
		 * try{
		 * 
		 * }catch(Exception e){
		 * 
		 * }
		 * 
		 */

	}// main() end

}// Ex2 end
