package vo;

import java.sql.Date;

public class Idol {
	private int idolId, height, weight, groupId;
	private Date birthDate;
	private String name;
	
	public Idol() {
		
	}
	
	@Override
	public String toString() {
		String msg = "idol_id : "+ idolId
				    +" / name : " + name
				    +" / birth_date : " + birthDate
				    +" / height : " + height
				    +" / weight : " + weight
				    +" / group_id : " + groupId;
				    
		return msg;
	}
	
	public int getIdolId() {
		return idolId;
	}
	public void setIdolId(int idolId) {
		this.idolId = idolId;
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
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
