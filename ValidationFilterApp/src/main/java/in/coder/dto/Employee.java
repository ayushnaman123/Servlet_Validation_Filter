package in.coder.dto;

import java.io.Serializable;

public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String eId;
	private String eName;
	private Integer eAge;
	private String eMail;
	private String eMobile;
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteAge() {
		return eAge;
	}
	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String geteMobile() {
		return eMobile;
	}
	public void seteMobile(String eMobile) {
		this.eMobile = eMobile;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eMail=" + eMail + ", eMobile="
				+ eMobile + "]";
	}
	
	
}
