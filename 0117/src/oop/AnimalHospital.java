package oop;

public class AnimalHospital {
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		
		cat1.name = "에디";
		cat1.age = 1;
		cat1.type = "코숏";
		cat1.weight = 1.7;
		
		Cat cat2 = new Cat();
		
		cat2.name = "아가";
		cat2.age = 2;
		cat2.type = "노르웨이숲";
		cat2.weight = 4;
		
		System.out.println(cat2.name);
		System.out.println(cat2.age);
		System.out.println(cat2.type);
		System.out.println(cat2.weight);
		
	}// main() end
}// AnimalHospital class end
