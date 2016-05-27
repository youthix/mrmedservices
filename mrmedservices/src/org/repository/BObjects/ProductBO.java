package org.repository.BObjects;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ProductBO {
	

	private String productID;
	private String companyID;
	private String prodName;
	private String type;
	private String composition;
	private String alternate;
	private String potency;
	private String pricePUnit;
	private String symp;
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public String getAlternate() {
		return alternate;
	}
	public void setAlternate(String alternate) {
		this.alternate = alternate;
	}
	public String getPotency() {
		return potency;
	}
	public void setPotency(String potency) {
		this.potency = potency;
	}
	public String getPricePUnit() {
		return pricePUnit;
	}
	public void setPricePUnit(String pricePUnit) {
		this.pricePUnit = pricePUnit;
	}
	public String getSymp() {
		return symp;
	}
	public void setSymp(String symp) {
		this.symp = symp;
	}


}
