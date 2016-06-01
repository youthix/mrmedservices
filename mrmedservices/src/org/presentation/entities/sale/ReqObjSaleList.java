package org.presentation.entities.sale;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reqparamsale")
public class ReqObjSaleList {
	
	private List<ReqObjSale> sl;
	private String bid;



	public List<ReqObjSale> getSl() {
		return sl;
	}

	public void setSl(List<ReqObjSale> sl) {
		this.sl = sl;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
}
