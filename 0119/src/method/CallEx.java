package method;

public class CallEx {

	int a;
	
	private void callByValue(int a) {
		a = a + 5;
	}
	
	private void callByR(CallEx a){
		a.a +=5;
	}

	public static void main(String[] args) {
		
		CallEx c = new CallEx();
		
		c.a =7;
		
		c.callByR(c);
		
		System.out.println(c.a);
		
//		int a = 7;
//		
//		CallEx c = new CallEx();
//		
//		c.callByValue(a);
//		
//		System.out.println(a);
	}// main() end
}// CallEx class end
