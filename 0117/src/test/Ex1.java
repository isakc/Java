package test;

import java.util.Scanner;
public class Ex1 {
	public static void main(String args[]){
		
		//scan변수를 선언하고
		//스캐너객체를 생성하고
		//대입
		Scanner scan = new Scanner(System.in);
		
		//당신의 나이는?
		System.out.println("당신의 나이는?");
		
		//정수를 하나를 입력받아서
		//나이입력받음
		int age = scan.nextInt();
		
		//만약 당신이 20살 이상이라면
		// "성인입니다" 라고 출력
		//만약 20살미만이면
		// "성인이 아닙니다".
		if(age>=20){
			System.out.println("성인입니다.");
		}else{
			System.out.println("성인이 아닙니다.");
		}//if ~ else end
	}//main() end
}//Ex1 class end