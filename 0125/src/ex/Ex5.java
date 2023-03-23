package ex;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("'끝'이라고 입력하면 종료됩니다.");
			String cmd = scan.nextLine();
			
			if(cmd.equals("끝")){
				System.out.println("끝이라고 입력하셨네요~^^ 종료!");
				break;
			}else{
				System.out.println("당신이 입력한 글자는 " +cmd);
				System.out.println("종료가 안되네요~\n");
			}//if~else end
			
		}//while end
	}//main() end
}//Ex5 class end
