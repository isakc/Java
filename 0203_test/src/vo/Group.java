package vo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Group {

	private int groupId;
	private String name;
	private String agent;
	private Date debutDate;
	
	public Group() {

	}
	
	
	public Group(int groupId, String name) {
		this.groupId = groupId;
		this.name = name;
	}

	public Group(String name, String agent, Date debutDate) {
		this.name = name;
		this.agent = agent;
		this.debutDate = debutDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.sss");
		String msg = "그룹번호 : " +groupId
				    +" / 그룹명 : " +name
				    +" / 소속사 : " +agent
				    +" / 소속일 : " +sdf.format(debutDate);
		return msg;
	}
	
	public int getGroupId() {
		return groupId;
	}
	
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public Date getDebutDate() {
		return debutDate;
	}
	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}
}
