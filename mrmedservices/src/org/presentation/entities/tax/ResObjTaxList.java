package org.presentation.entities.tax;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.presentation.entities.ResStatus;
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjTaxList {
	List<ResObjTaxation> tl;
	ResStatus resStatus;
	public List<ResObjTaxation> getTl() {
		if(null==this.tl){
			this.tl=new ArrayList<ResObjTaxation>();
		}
		return tl;
	}
	public void setTl(List<ResObjTaxation> tl) {
		this.tl = tl;
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
