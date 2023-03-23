package control;

public class BreakEx {

	public static void main(String[] args) {

		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;

			// break문 : 반복문을 끝냄
			if(i==5){
				break;
			}//if end
		}//for end

	}// main() end
}// BreakEx class end
