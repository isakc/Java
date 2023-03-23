package method;

public class CalculatorApp {

	public static void main(String[] args) {

		int number1 = 8;
		int number2 = 4;
		int result;
		double resultDivide;

		Calculator calc = new Calculator();
		// Calculator클래스를 가지고 만들어진
		// 객체 레퍼런스를 담을 수 있는
		// 지역변수 calc

		result = calc.sum(number1, number2);
		System.out.println("덧셈: " + result);

		result = calc.subtract(number1, number2);
		System.out.println("뺄셈: " + result);

		result = calc.multiply(number1, number2);
		System.out.println("곱셈: " + result);

		resultDivide = calc.divide(number1, number2);
		System.out.println("나눗셈: " + resultDivide);

	}// main() end
}// CalculoatrApp class end\