package org.presentation.entities.company;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.presentation.entities.ResStatus;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjCompanyList {
	List<ResObjCompany> cl;
	ResStatus resStatus;
	public List<ResObjCompany> getCl() {
		if(null==this.cl){
			this.cl=new ArrayList<ResObjCompany>();
		}
		return cl;
	}
	public void setCl(List<ResObjCompany> cl) {
		this.cl = cl;
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
