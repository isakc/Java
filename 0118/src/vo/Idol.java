package vo;

public class Idol {

	/*
	 * 데이터만 담는 객체 
	 * (Value Object) : VO 
	 * (Data Transfer Object) : DTO
	 */

	private String name; // 이름
	private char gender; // 성별 'M','F'
	private int height; // 키
	private int weight; // 몸무게
	
	//이름에 대한 getter
	public String getName() {
		return name;
	}
	
	//이름에 대한 setter
	public void setName(String name) {
		this.name = name;
	}
	
	//성별에 대한 getter
	public char getGender(){
		return gender;
	}
	
	//성별에 대한 setter
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//키에 대한 getter
	public int getHeight(){
		return height;
	}
	
	//키에 대한 setter
	public void setHeight(int height){
		this.height = height;
	}
	
	//몸무게에 대한 getter
	public int getWeight(){
		return weight;
	}
	
	//몸무게에 대한 setter
	public void setWeight(int weight){
		this.weight = weight;
	}
}
