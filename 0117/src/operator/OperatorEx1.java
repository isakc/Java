package operator;

import java.util.Scanner;
public class OperatorEx1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//스캐너 객체 선언
		
		System.out.println("정수 2개를 입력하세요.");
		//정수 2개 입력!
		
		int num1 = scan.nextInt();
		//정수1 받고

		int num2 = scan.nextInt();
		//정수2 받고
		
		//+연산자
		// 1) 피연산자2개가 모두 숫자일 경우
		//   덧셈연산
		// 2) 피연산자중에 한개라도 문자열이
		//    있으면 문자열 합침연산
		//    (나머지 피연산자도 문자열로 변경)
		// 3)
		//
		//
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		//덧셈 출력 6 + 4 = 10
		
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		//곱셉 출력 6 * 4 = 24
		
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		//뺄셈 출력 6 - 4 = 2
		
		System.out.println(num1 + " / " + num2 + " = " + (double)num1/num2);
		//나눗셈 출력 6 / 4 = 1
		
		System.out.println(num1 + " % " + num2 + " = " + num1%num2);
		// % 연산자
		// 나머지 연산자
		
	}//main() end
}//OperatorEx1 class end
