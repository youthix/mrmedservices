package org.repository.BObjects;


public class StockBO {
	
	private String stockID;
	private String productID;
	private String batch;
	private String mfgDt;
	private String expDt;
	private String buyQty;
	private String leftQty;
	private String unitID;
	private String price;
	private String locator;	
	private String dtCreated;
	private String dtUpdated;
	private String catID;
	private String active;
	public String getStockID() {
		return stockID;
	}
	public void setStockID(String stockID) {
		this.stockID = stockID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getMfgDt() {
		return mfgDt;
	}
	public void setMfgDt(String mfgDt) {
		this.mfgDt = mfgDt;
	}
	public String getExpDt() {
		return expDt;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}	
	public String getUnitID() {
		return unitID;
	}
	public void setUnitID(String unitID) {
		this.unitID = unitID;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getBuyQty() {
		return buyQty;
	}
	public void setBuyQty(String buyQty) {
		this.buyQty = buyQty;
	}
	public String getLeftQty() {
		return leftQty;
	}
	public void setLeftQty(String leftQty) {
		this.leftQty = leftQty;
	}
	public String getLocator() {
		return locator;
	}
	public void setLocator(String locator) {
		this.locator = locator;
	}
	public String getDtCreated() {
		return dtCreated;
	}
	public void setDtCreated(String dtCreated) {
		this.dtCreated = dtCreated;
	}
	public String getDtUpdated() {
		return dtUpdated;
	}
	public void setDtUpdated(String dtUpdated) {
		this.dtUpdated = dtUpdated;
	}
	public String getCatID() {
		return catID;
	}
	public void setCatID(String catID) {
		this.catID = catID;
	}	
	
	
}
