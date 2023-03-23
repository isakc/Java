package vo;

public class Actor {
	
	private String name;
	private int height;
	private int weight;
	
	public Actor(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}//Actor(String name, int height, int weight) constructor end
	
	public Actor() {
		
	}//Actor() constructor end

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}