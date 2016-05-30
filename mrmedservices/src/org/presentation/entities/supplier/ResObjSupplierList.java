package org.presentation.entities.user;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparamuser")
public class ResObjSupplierList {
	
	List<ResObjUser> ul;
	ResStatus resStatus;

	public List<ResObjUser> getUl() {
		if(null==this.ul){
			ul=new ArrayList<ResObjUser>();
		}
		return ul;
	}

	public void setUl(List<ResObjUser> ul) {
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
