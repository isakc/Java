package scanner;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
}