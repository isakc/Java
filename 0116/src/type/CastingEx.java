package type;

public class CastingEx {

	public static void main(String[] args) {
		byte b = 3;
		short s =  1;
		int i = 4 ;
		long l = 2;
		
		//작은데이터가 큰 변수에 대입
		//자동형변환(프로모션)
		s = b;
		
		s = 190;
		
		//큰 데이터를 작은 변수에 대입
		//강제형변환(디모션)
		//정보의 손실이 있다.
		b = (byte)s;
		
		System.out.println(b);

	}//main() end
}//CastingEx class end
