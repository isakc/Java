package oop;

abstract class C {
	abstract void test();
}

class D extends C {
	// 부모가 가진 추상메소드는 반드시
	// 구현해야만 한다
	@Override
	void test() {
		System.out.println("D");
	}
}

public class AbstractEx {

	public static void main(String[] args) {

		C c = new D();

		c.test();

	}// main() end
}// AbstractEx class end
