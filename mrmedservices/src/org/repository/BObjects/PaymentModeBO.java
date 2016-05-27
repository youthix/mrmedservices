package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PaymentModeBO {
	
	private String modeID;
	private String modeDet;
	private String active;
	public String getModeID() {
		return modeID;
	}
	public void setModeID(String modeID) {
		this.modeID = modeID;
	}
	public String getModeDet() {
		return modeDet;
	}
	public void setModeDet(String modeDet) {
		this.modeDet = modeDet;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	
}
