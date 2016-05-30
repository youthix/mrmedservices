package org.presentation.entities.supplier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reqparamsupp")
public class ReqObjSupplierList {
	
	private List<ReqObjSupplier> sl;
	private String bid;

	
	public List<ReqObjSupplier> getSl() {
		
		if(null==this.sl){
			sl=new ArrayList<ReqObjSupplier>();
		}
		return sl;
	}

	public void setSl(List<ReqObjSupplier> sl) {
		this.sl = sl;
	}


	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	
}
