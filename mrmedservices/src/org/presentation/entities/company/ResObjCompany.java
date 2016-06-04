package org.presentation.entities.company;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjCompany {
	private String cID;
	private String cName;
	private String prof;
	private String logo;
	private String cURL;
	private String cPer;
	private String cNo;
	private String email;
	public String getcID() {
		return cID;
	}
	public void setcID(String cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getcURL() {
		return cURL;
	}
	public void setcURL(String cURL) {
		this.cURL = cURL;
	}
	public String getcPer() {
		return cPer;
	}
	public void setcPer(String cPer) {
		this.cPer = cPer;
	}
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
