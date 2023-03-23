package random;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {

		//Math.random() 1.4이전
		
		//5버전 : Random
		
		Random ran = new Random();
		
		for(int i=0; i < 100; i++){
			int num = ran.nextInt(6);
			
			System.out.println(5/num);
		}//for end
	
	}//main() end
}//Ex1 end
