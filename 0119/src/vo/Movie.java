package vo;

public class Movie {

	private String name;// 영화명
	private String director;// 감독

	//기본생성자
	public Movie(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}