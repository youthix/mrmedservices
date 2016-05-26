package org.presentation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "reqparam")
public class RequestObj {
	
	private String una;
	
	private String pwd;
	
	private String pno;

	public String getUna() {
		return una;
	}

	public void setUna(String una) {
		this.una = una;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}	
	
	

}
