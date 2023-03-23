package ex;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println("★2017년 2월 4일 로또1등★");
		for(int i=0; i<6;i++){
			int num = ran.nextInt(45)+1;
			if(i!=5){
				System.out.print(num+", ");
			}else{
				System.out.println(num);
			}//if~ else end
			
		}//for end
		
	}//main end
}//Ex07 end
