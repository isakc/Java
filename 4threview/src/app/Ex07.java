package app;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex07 {

	public static void main(String[] args) {

		// 랜덤 / 중복제거 / 정렬
		System.out.println("2017년 2월 11일 로또 1등");

		Set<Integer> lottos = new TreeSet<Integer>();
		Random random = new Random();
		
		while(true){
			int ran = random.nextInt(45)+1;
			lottos.add(ran);
			
			if(lottos.size()==6){
				break;
			}//if end
		}//while end
		String str = lottos.toString();
		str = str.substring(1, str.length()-1);
		System.out.println(str);
		
	}// main end
}// Ex07 end
