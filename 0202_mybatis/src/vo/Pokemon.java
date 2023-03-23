package vo;

import java.sql.Date;

public class Pokemon {

	private int no;
	private String name;
	private int cp;
	private double height;
	private double weight;
	private Date catchDate;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public Date getCatchDate() {
		return catchDate;
	}
	public void setCatchDate(Date catchDate) {
		this.catchDate = catchDate;
	}
	
	public Pokemon() {
		
	}
	
	public Pokemon(String name, int cp, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.cp = cp;
	}
	
	public Pokemon(int no, String name) {
		this.no = no;
		this.name = name;
	}
}
