package ex;

import java.util.*;

public class Ex8 {
	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		System.out.println("당신이 좋아하는 아이돌 그룹이름은?");
		String idol = scanString.nextLine();

		System.out.println("인원은 몇명입니까?");
		int number = scanInt.nextInt();
		
		String[] group = new String[number];
		for (int i = 0; i < number; i++) {
			System.out.println("멤버 이름 한명을 입력하세요.");
			String name = scanString.nextLine();
			group[i] = name;
		}

		System.out.print("당신이 좋아하는 그룹은 " + idol + "이고 멤버이름은 ");
		for (int i = 0; i < group.length; i++) {
			if (i == (group.length - 1)) {
				System.out.print(group[i]);
			} else {
				System.out.print(group[i] + ",");
			} // if~else end
		} // for end
		System.out.println("입니다.");

	}// main() end
}// Ex8 class end
