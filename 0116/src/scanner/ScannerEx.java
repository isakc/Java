package scanner;

//외부패키지에 있는 클래스를 사용하려면
//import(수입)해서 써야합니다.
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {

		//객체자료형 Scanner형 변수 scan을 선언
		//하고 스캐너 객체를 생성하여 대입
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 이름은?");
		String name = scan.nextLine();
		System.out.println("당신의 이름은? " + name + "입니다.");
		
	}//main() end
}//ScannerEx class end