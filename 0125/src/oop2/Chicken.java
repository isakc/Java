package oop2;

public interface Chicken {

	/*
	 * 인터페이스는 상수와 추상메소드만 가짐
	 * (변수와 일반 메소드는 선언불가)
	 * 
	 *  클래스처럼 객체생성이 안됨
	 *  
	 *  인터페이스는 추상메소드만 가지므로
	 *  abstract키워드를 생략할 수 있다.
	 *  
	 *  인터페이스는 상수만 가지므로 
	 *  static과 final이 생략가능
	 */

	public void makeFired();
	public void makeSpicy();
	
	static final int PRICE = 15000;
}