package ex;

import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작수를 입력하세요");
		int start = scan.nextInt();
		System.out.println("끝수를 입력하세요.(시작수보다 크게)");
		int end = scan.nextInt();
		
		for(int i=start;i<=end;i++){
			System.out.print(i+"\t");
		}//for end
		
	}//main() end
}//Ex3 class end
