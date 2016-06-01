package org.presentation.entities.purchase;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reqparamuser")
public class ReqObjPurchaseList {
	
	private List<ReqObjPurchase> pu;
	private String bid;


	public List<ReqObjPurchase> getPu() {
		return pu;
	}

	public void setPu(List<ReqObjPurchase> pu) {
		this.pu = pu;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
}
