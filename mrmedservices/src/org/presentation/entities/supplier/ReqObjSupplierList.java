package org.presentation.entities.supplier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement(name = "reqparamsupp")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
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
