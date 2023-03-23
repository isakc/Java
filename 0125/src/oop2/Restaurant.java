package oop2;

public class Restaurant implements Chicken,Pizza{

	@Override
	public void makePotato() {
		System.out.println("포테이토피자완료!!");
		
	}

	@Override
	public void makePasta() {
		System.out.println("파스타완료!!");
		
	}

	@Override
	public void makeFired() {
		System.out.println("후라이드완료!!");
		
	}

	@Override
	public void makeSpicy() {
		System.out.println("양념치킨완료!!");
		
	}

	public void makeChickenFoot(){
		System.out.println("닭발완료!");
	}
	
	public void makeTripe(){
		System.out.println("곱창완료!");
	}
	
/*
 * interface의 키워드는 implements(구현)
 * 다중구현은 가능
 */

}
