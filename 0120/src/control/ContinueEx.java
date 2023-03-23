package control;

public class ContinueEx {

	public static void main(String[] args) {

		for (int i = 2; i < 11; i += 2) {
			
			if(i== 3){
				//반복문의 한번 넘기기
				continue;
			}//if end
			
			System.out.println(i);
			
		} // for문 end

	}// main() end
}// ContinueEx class end
