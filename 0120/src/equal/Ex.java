package equal;

public class Ex {
	public static void main(String[] args) {
		A a = new A(3);
		A b = new A(3);

		A c = a;

		a = null;

		b = c;

		// 객체의 항등은 레퍼런스 비교
		// == 연산자
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a == c);

		// equals() 메소드와 == 동일
		System.out.println(b.equals(a));
		System.out.println(b.equals(c));
		System.out.println(c.equals(a));

		/*
		 * 모든 객체는 equals() 메소드를 가지고 있다.
		 * (상속)
		 * 
		 */

	}// main() end
}// Ex class end
