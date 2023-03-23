package array;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		String[] twice = {"쯔위","나연","모모","사나"};
		
		for (int i = 0; i < twice.length; i++) {
			System.out.println(twice[i]);
		}//for end

		
		//자바 5에 추가된 for~each문, 향상된 for문
		//for(자료형 변수 :배열(혹은컬랙션)){}
		for (String name : twice) {
			System.out.println(name);
		}//for end
		
	}//main() end
}//ArrayEx2 class end
