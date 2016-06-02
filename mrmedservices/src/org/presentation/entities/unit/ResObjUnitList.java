package org.presentation.entities.unit;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.ResStatus;

public class ResObjUnitList {
	List<ResObjUnit> ul;
	ResStatus resStatus;
	public List<ResObjUnit> getUl() {
		if(null==this.ul)
		{
			this.ul=new ArrayList<ResObjUnit>();
		}
		return ul;
	}
	public void setUl(List<ResObjUnit> ul) {
		this.ul = ul;
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
