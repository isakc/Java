package equal;

public class B {

	int a;

	private B(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		B a = new B(4);
		B b = new B(7);
		B c = null;
		B d = b;

		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // false
		System.out.println(a.equals(d)); // false
		System.out.println(b.equals(d)); // true
		System.out.println(c.equals(d)); // NullPointerException 발생
		System.out.println(d.equals(a)); // false
		System.out.println(d.equals(b)); // true
	}
}