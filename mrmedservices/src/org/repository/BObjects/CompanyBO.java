package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CompanyBO {
	
	private String comID;
	private String comName;
	private String profile;
	private String logo;
	private String comURL;
	private String contPerson;
	private String contNo;
	private String email;
	public String getComID() {
		return comID;
	}
	public void setComID(String comID) {
		this.comID = comID;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getComURL() {
		return comURL;
	}
	public void setComURL(String comURL) {
		this.comURL = comURL;
	}
	public String getContPerson() {
		return contPerson;
	}
	public void setContPerson(String contPerson) {
		this.contPerson = contPerson;
	}
	public String getContNo() {
		return contNo;
	}
	public void setContNo(String contNo) {
		this.contNo = contNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		
}
