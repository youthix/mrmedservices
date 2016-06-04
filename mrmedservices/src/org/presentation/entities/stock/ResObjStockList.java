package org.presentation.entities.stock;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.presentation.entities.ResStatus;
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjStockList {
	List<ResObjStock> sl;
	ResStatus resStatus;
	public List<ResObjStock> getSl() {
		if(null==this.sl){
			this.sl=new ArrayList<ResObjStock>();
		}
		return sl;
	}
	public void setSl(List<ResObjStock> sl) {
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
