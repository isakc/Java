package test;

import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("전화번호를 입력하세요.");
		System.out.println("예)010-1234-5678");
		
		String phone = scan.nextLine();
//		StringTokenizer st = new StringTokenizer(phone,"-");
//		
//		while(st.hasMoreTokens()){
//			String number = st.nextToken();
//			System.out.println(number);
//		}//while() end
//-----------------StringTokenizer를 이용한 방법 ---------------------------
		
		
		String[] nums = phone.split("-");
//		for(int i=0; i<nums.length; i++){
//			System.out.println(nums[i]);
//		}
//------------------split 메소드 , for문 ----------------------------------
		
		
		for(String s : nums){
			System.out.println(s);
		}
//------------------split 메소드 , for-each문 -----------------------------
		
	}// main() end
}// Ex1 class end
