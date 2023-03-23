package vo;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Movie {
	private int no;
	private String name;
	private Date releaseDate;
	private Date endDate;
	private String director;
	private int audienceNum;
	private int genre;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	private DecimalFormat df = new DecimalFormat("#,###");
	public Movie() {
		
	}
	
	public Movie(String name, Date releaseDate, Date endDate, String director, int audienceNum, int genre) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.endDate = endDate;
		this.director = director;
		this.audienceNum = audienceNum;
		this.genre = genre;
	}



	@Override
	public String toString() {
		String msg = no+") "
				    + name
				    + " / 감독 : " +director
				    + " / 개봉일 : " +sdf.format(releaseDate)
				    + " / 관객수 : " + df.format(audienceNum)+"명"
				    + " / 장르 : " +genre;
		return msg;
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
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public int getAudienceNum() {
		return audienceNum;
	}
	public void setAudienceNum(int audienceNum) {
		this.audienceNum = audienceNum;
	}
	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}
	
	
}
