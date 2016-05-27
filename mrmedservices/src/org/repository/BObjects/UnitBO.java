package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UnitBO {
	
	private String unitID;
	private String unitDet;
	private String active;
	public String getUnitID() {
		return unitID;
	}
	public void setUnitID(String unitID) {
		this.unitID = unitID;
	}
	public String getUnitDet() {
		return unitDet;
	}
	public void setUnitDet(String unitDet) {
		this.unitDet = unitDet;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	

		
}
