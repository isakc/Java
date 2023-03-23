package array;

public class ArrayEx1 {
	public static void main(String[] args) {

		int[] iArr = new int[4];

		int j = 4;
		iArr[0] = j;
		j = iArr[2];
		iArr[1] = 9;
		iArr[2] = iArr[3];

		/*
		 * 배열과 for문은 궁합이 좋음
		 */

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}//for end
		
		for(int num : iArr){
			System.out.println(num);
		}//for end

	}// main() end
}// ArrayEx1 class end