package animal;

public class AnimalHospitalApp {
	
	public static void main(String[] args) {

		Animal[] rooms = new Animal[5];
		
		Orca o = new Orca();
		rooms[0] = o;
		
		Chicken ch = new Chicken();
		rooms[1] = ch;
		
		Anaconda a = new Anaconda();
		rooms[2] = a;
		
		GoldFish g = new GoldFish();
		rooms[3] = g;
		
		Cat c = new Cat();
		rooms[4] = c;
		
		for(int i = 0; i < rooms.length; i++){
			rooms[i].cry();
		}
		
	}//main() end
}//AnimalApp end
