package vo;

import java.sql.Timestamp;

public class Phone {

	private int no;
	private String name;
	private String phone;
	private String address;
	private Timestamp regdate;
	
	@Override
	public String toString() {
		String msg ="no : " +no
				   +" / name : " +name
				   +" / phone : " +phone
				   +" / address : " +address
				   +" / regdate : " +regdate
				;
		return msg;
	}
	public Phone() {
		
	}
	
	public Phone(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}


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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Timestamp getRegdate() {
		return regdate;
	}


	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
}//Phone end
