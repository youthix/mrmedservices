package org.presentation.entities.tax;


public class ResObjTaxation {
	private String tID;
	private String tDet;
	private String tAmt;
	private String act;
	public String gettID() {
		return tID;
	}
	public void settID(String tID) {
		this.tID = tID;
	}
	public String gettDet() {
		return tDet;
	}
	public void settDet(String tDet) {
		this.tDet = tDet;
	}
	public String gettAmt() {
		return tAmt;
	}
	public void settAmt(String tAmt) {
		this.tAmt = tAmt;
	}
	public String getAct() {
		return act;
	}
	public void setAct(String act) {
		this.act = act;
	}
}
