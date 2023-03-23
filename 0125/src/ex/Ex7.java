package ex;

import java.util.*;

public class Ex7 {
	public static void main(String[] args) {
		//크기가 3인 String배열을 선언하고 생성
		String[] s = new String[3];
		Scanner scan = new Scanner(System.in);
		
		//사람이름을 3번 반복하여 입력받고 그 이름을
		//배열 0,1,2번지에 저장합니다.
		for (int i = 0; i < s.length; i++) {
			System.out.println("친구의 이름을 적어주세요.");
			s[i] = scan.nextLine();
		}
		
		System.out.print("친구의 이름은 ");
		for(int i=0; i<s.length; i++){
			if(i==(s.length-1)){
				System.out.print(s[i]);
			}else{
				System.out.print(s[i]+",");	
			}//if~else end
		}//for end
		
		System.out.println("입니다.");
		//그리고 이름을 출력합니다.
		//친구의 이름은 XXX,YYY,ZZ 입니다.
		
		
	}// main() end
}// Ex7 class end
