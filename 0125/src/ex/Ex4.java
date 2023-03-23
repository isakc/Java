package ex;

import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 주민등록번호 앞의 6자리를 입력하세요.");
		String rrn = scan.nextLine();
		
		int month = Integer.parseInt(rrn.substring(2,4));
		int date = Integer.parseInt(rrn.substring(4,6));
		
		//String은 int로 바꿔주는 메소드
		//Integer.parseInt()
		
		System.out.println("당신의 생일은 "+month+"월 " +date+"일입니다.");
		
	}//main() end
}//Ex4 class end
