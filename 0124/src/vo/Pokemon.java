package vo;

public class Pokemon {
	
	//풀 상수
	public static final int GRASS = 8;
	public static final int WATER = 0;
	public static final int ELECTRICITY = 1; 
	public static final int FIRE = 2;
	public static final int WIND = 3;
	public static final int IRON = 4;
	
	private String name;//이름
	private int type;//속성(물0,전기 1,불2,바람3,강철4,땅5,드래곤6,고스트7,풀8)
	private int cp;
	
	public Pokemon(){
		
	}
	
	public Pokemon(String name, int type, int cp){
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
}