package org.presentation.entities.customer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparamcust")
public class ResObjCustomerList {

	
	private List<ResObjCustomer> cl;
	private ResStatus resStatusObj ;

	public List<ResObjCustomer> getCl() {
		if(null==this.cl){
			cl=new ArrayList<ResObjCustomer>();
		}
		return cl;
	}

	public void setCl(List<ResObjCustomer> cl) {
		this.cl = cl;
	}

	public ResStatus getResStatusObj() {
		return resStatusObj;
	}

	public void setResStatusObj(ResStatus resStatusObj) {
		this.resStatusObj = resStatusObj;
	}
	

}
