package string;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("+++영화퀴즈+++");
		System.out.println("무소불위 권력을 쥐고 폼 나게 살고 싶었던 태수는"
				         + "\n우여곡절 끝에 권력의 설계자 한강식을 만나"
				         + "\n핵심 라인을 타고 승승장구 하게 된다"
				         + "\n정권이 교체되는 중요한 시기,"
				         + "\n새로운 판을 짜며 기회를 노리던 이들 앞에"
				         + "\n예상치 못한 위기가 닥치는데..."
				         + "\n2017년, 대한민국이 속 시원하게 뒤집힌다!");

		System.out.println("다음의 영화의 이름은?");
		
		while(true){
			
			// 유저가 영화이름을 입력합니다.
			String name = scan.nextLine();
			
			// 만약 '더 킹'면 정답
			if(name.equals("더 킹")){
				System.out.println("정답");
				break;
			}else{
				// 아니면 오답
				System.out.println("오답\n한번더");
			}// if~else end
		}// while() end
	}// main() end
}// Ex1 class end
