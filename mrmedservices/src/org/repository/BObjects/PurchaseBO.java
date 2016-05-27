package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PurchaseBO {
	
	private String purID;
	private String purDt;
	private String suppID;
	private String invDet;
	private String stockInfo;
	private String paymentStat;
	private String payInfo;
	private String userName;
	private String disc;
	private String addDisc;
	private String taxID;
	private String grossAmt;
	private String netAmt;
	private String remarks;
	private String active;
	public String getPurID() {
		return purID;
	}
	public void setPurID(String purID) {
		this.purID = purID;
	}
	public String getPurDt() {
		return purDt;
	}
	public void setPurDt(String purDt) {
		this.purDt = purDt;
	}
	public String getSuppID() {
		return suppID;
	}
	public void setSuppID(String suppID) {
		this.suppID = suppID;
	}
	public String getInvDet() {
		return invDet;
	}
	public void setInvDet(String invDet) {
		this.invDet = invDet;
	}
	public String getStockInfo() {
		return stockInfo;
	}
	public void setStockInfo(String stockInfo) {
		this.stockInfo = stockInfo;
	}
	public String getPaymentStat() {
		return paymentStat;
	}
	public void setPaymentStat(String paymentStat) {
		this.paymentStat = paymentStat;
	}
	public String getPayInfo() {
		return payInfo;
	}
	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	public String getAddDisc() {
		return addDisc;
	}
	public void setAddDisc(String addDisc) {
		this.addDisc = addDisc;
	}
	public String getTaxID() {
		return taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	public String getGrossAmt() {
		return grossAmt;
	}
	public void setGrossAmt(String grossAmt) {
		this.grossAmt = grossAmt;
	}
	public String getNetAmt() {
		return netAmt;
	}
	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	
}
