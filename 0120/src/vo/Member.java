package vo;

public class Member {

	private String name;// 이름
	private String code;// 학번(예: 17학번)
	private String major;// 전공
	private char gender;// 성별 'M','F'
	
	// 기본생성자
	public Member(){
		
	}
	
	//4개짜리 생성자
	public Member(String name, String code, String major, char gender){
		this.name = name;
		this.gender = gender;
		this.code = code;
		this.major = major;
	}
	
	//3개짜리 생성자
	public Member(String name, String code, char gender){
		this(name, code, "컴퓨터공학", gender);
	}
	
	//2개짜리 생성자
	public Member(String name, char gender){
		this(name, "17학번", "컴퓨터공학", gender);
	}
	
	//1개짜리 생성자
	public Member(String name){
		this(name, 'M');
	}
	

	// setter / getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}// Member class end