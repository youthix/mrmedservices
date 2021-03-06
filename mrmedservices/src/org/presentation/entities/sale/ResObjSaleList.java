package org.presentation.entities.sale;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparamsale")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjSaleList {
	
	List<ResObjSale> sl;
	ResStatus resStatus;

	public List<ResObjSale> getSl() {
		return sl;
	}

	public void setSl(List<ResObjSale> sl) {
		this.sl = sl;
	}

	public ResStatus getResStatus() {
		if(null==this.resStatus){
			resStatus= new ResStatus();	
		}
		return resStatus;
	}

	public void setResStatus(ResStatus resStatus) {
		this.resStatus = resStatus;
	}
	
}
