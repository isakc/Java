package test;

public class Test2 {
	public static void main(String[] args) {
		A a = new B();
		Object o = new C();
		B b = (B)a;
		o = b;
	}
}
