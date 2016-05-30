package org.presentation.entities.supplier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparamsupp")
public class ResObjSupplierList {
	
	List<ResObjSupplier> sl;
	ResStatus resStatus;

	
	public List<ResObjSupplier> getSl() {
		
		if(null==this.sl){
			sl=new ArrayList<ResObjSupplier>();
		}
		return sl;
	}

	public void setSl(List<ResObjSupplier> sl) {
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
