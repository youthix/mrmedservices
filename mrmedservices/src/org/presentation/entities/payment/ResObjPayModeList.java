package org.presentation.entities.payment;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.ResStatus;

public class ResObjPayModeList {
	List<ResObjPayMode> pml;
	ResStatus resStatus;
	public List<ResObjPayMode> getPml() {
		if(null==this.pml){
			this.pml=new ArrayList<ResObjPayMode>();
		}
		return pml;
	}
	public void setPml(List<ResObjPayMode> pml) {
		this.pml = pml;
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
