package constructor;

import vo.Member;

public class MemberApp {

	public static void main(String[] args) {

		// 개발동아리
		// 컴공, 남자, 16학번

		Member m1 = new Member("남윤명", "16학번", "심리학", 'F');
		System.out.println("이름: " + m1.getName());
		System.out.println("성별: " + m1.getGender());
		System.out.println("학번: " + m1.getCode());
		System.out.println("학과: " + m1.getMajor());
		
		System.out.println("--------------------------------");

		Member m2 = new Member("정우성", "16학번", 'F');
		System.out.println("이름: " + m2.getName());
		System.out.println("성별: " + m2.getGender());
		System.out.println("학번: " + m2.getCode());
		System.out.println("학과: " + m2.getMajor());
		
		System.out.println("--------------------------------");

		Member m3 = new Member("이동욱", 'F');
		System.out.println("이름: " + m3.getName());
		System.out.println("성별: " + m3.getGender());
		System.out.println("학번: " + m3.getCode());
		System.out.println("학과: " + m3.getMajor());
		
		System.out.println("--------------------------------");
		
		Member m4 = new Member("공유");
		System.out.println("이름: " + m4.getName());
		System.out.println("성별: " + m4.getGender());
		System.out.println("학번: " + m4.getCode());
		System.out.println("학과: " + m4.getMajor());
	}// main() end
}// MemberApp class end