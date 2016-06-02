package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class TaxationBO {
	
	private String taxID;
	private String taxDet;
	private String taxAmt;
	private String active;
	public String getTaxID() {
		return taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	public String getTaxDet() {
		return taxDet;
	}
	public void setTaxDet(String taxDet) {
		this.taxDet = taxDet;
	}
	public String getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	
}
