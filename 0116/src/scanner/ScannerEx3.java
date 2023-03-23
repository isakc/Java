package scanner;

import java.util.Scanner;
public class ScannerEx3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개 입력");
		
		//정수받는 메소드
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("첫번째 정수 : " + num+ "\n두번째 정수 : " +num2);
	}
}
