package org.presentation.entities.payment;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement(name = "paydet")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjPayDet {
	
	private String pID;
	private String pmID;
	private String det;
	private String pDt;
	private String re;
	private String act;
	public String getpID() {
		return pID;
	}
	public void setpID(String pID) {
		this.pID = pID;
	}
	public String getPmID() {
		return pmID;
	}
	public void setPmID(String pmID) {
		this.pmID = pmID;
	}
	public String getDet() {
		return det;
	}
	public void setDet(String det) {
		this.det = det;
	}
	public String getpDt() {
		return pDt;
	}
	public void setpDt(String pDt) {
		this.pDt = pDt;
	}
	public String getRe() {
		return re;
	}
	public void setRe(String re) {
		this.re = re;
	}
	public String getAct() {
		return act;
	}
	public void setAct(String act) {
		this.act = act;
	}	

	
}
