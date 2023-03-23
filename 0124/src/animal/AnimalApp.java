package animal;

public class AnimalApp {

	public static void main(String[] args) {
		/*
		 * 다형성(polymorphism)이란
		 * 하나의 인스턴스가
		 * 다양한 객체자료형으로
		 * 변환이 가능한 성질로서
		 * 
		 * new Dog() -> Dog, Animal, Object
		 */
		
		Dog d = new Dog();
		Animal a = d;//자동형변환
		Object o = a;//자동형변환
		Cat c2 = new Cat();
		a=c2;
		
		
		a=(Animal)o;//강제형변환
		d=(Dog)a;//강제형변환
		d=(Dog)o;//강제형변환
		
		Animal[] rooms = new Animal[5];
		
		Cat c = new Cat();
		c.name="첵스";
		c.age = 2;

		rooms[0] = c;
		
		Panda p = new Panda();
		p.name = "팬더";
		p.age = 6;
		
		rooms[1] = p;
		
		rooms[2] = new Orca();
		rooms[2].name= "고래";
		
		
	}//main() end
}//AnimalApp class end
