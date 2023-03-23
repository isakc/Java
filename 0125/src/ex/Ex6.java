package ex;

public class Ex6 {
	public static void main(String[] args) {

		// int배열형 지역변수 iArr을 선언합니다.
		int[] iArr;

		// 길이가 5인 배열을 생성하여 iArr변수에 대입
		iArr = new int[5];

		//각 0~4번지에 3,4,5,6,7 숫자를 대입합니다.
		
		for(int i=0;i<iArr.length;i++){
			iArr[i] = i+3;
		}

		//일반 for문으로 출력하세요.
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}//for end
		
	}// main() end
}// Ex6 class end
