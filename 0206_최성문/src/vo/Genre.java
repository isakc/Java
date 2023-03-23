package vo;

public class Genre {
	private int no;
	private String name;
	
	@Override
	public String toString() {
		String msg = " 번호 : " +no
				    +" / 장르명 : "+name;
		return msg;
	}
	
	public Genre() {
		
	}

	
	public Genre(String name) {
		super();
		this.name = name;
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
	
	
}
