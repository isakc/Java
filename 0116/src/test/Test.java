package test;

public class Test {
	
	static final int IM = 3;
	static final int RE = 10;
	
	public static int[][] test(int i){
		int[][] array = new int[4][4];
		switch(i){
			case 0 : 
			array[0][2] = RE;
			array[1][3] = RE;
			array[2][0] = RE;
			array[3][1] = RE;

			return array;
			
			case 1 :
			array[0][3] = RE;
			array[1][2] = RE;
			array[2][1] = -RE;
			array[3][0] = -RE;
			return array;
			
			default:
				array[0][2] = RE;
				return array;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(test(5)[2][3]);
	}
}