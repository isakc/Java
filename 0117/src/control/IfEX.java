package control;

import java.util.Scanner;

//외부의 클래스를 사용하려면 import
public class IfEX {
	public static void main(String[] args) {
		
		Scanner x;
		//Scanner클래스를 가지고 만들어진
		//객체의 레퍼런스를 담을 수 있는
		//지역변수 x를 선언
		
		x = new Scanner(System.in);
		//Scanner객체를 생성하고
		//그 레퍼런스를 x에 대입
		
//		System.out.println("++++ 학점 추출 프로그램 v 0.99 ++++");
//		System.out.println("당신의 점수는?");
//		
//		int score = x.nextInt();
//		
//		if(score>90){
//			System.out.println("합격");
//		}else{
//			System.out.println("불합격");
//		}
		//90점 초과 합격
		//90점 이하이면 불합격
		
		
		/*
		 * if(조건식1) {
		 * 
		 * }else if(조건식2){
		 * 
		 * }else if(조건식3){
		 * 
		 * ....}else{
		 *   모든 조건식이 false일 때
		 * }
		 * 
		 */
		
		/*
		 * 91~100 : A학점
		 * 81~90 : B학점
		 * 71~80 : C학점
		 * 61~70 : D학점
		 * 60점이하 : F학점
		 * 
		 */
		
		
		System.out.println("++++ 학점 추출 프로그램 v 0.99 ++++");
		System.out.println("당신의 점수는?");
		
		int score = x.nextInt();
		
		char grade;
		if(score>90){
			grade = 'A';
		}else if(score>80){
			grade = 'B';
		}else if(score>70){
			grade = 'C';
		}else if(score>60){
			grade = 'D';
		}else{
			grade = 'F';
		}//if ~ else end
		
		System.out.println("당신의 학점은 " + grade +  "입니다");
		//당신의 학점은 A입니다.
		
		
	}//main() end
}//IfEx class end
