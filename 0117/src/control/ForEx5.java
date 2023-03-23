package control;

public class ForEx5 {

	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t"); //\t으로 띄우기
			} //안쪽 for문 end

			System.out.println(""); // 줄바꾸기
		} //바깥쪽 for문 end

	}//main() end
}//ForEx5 class end