package org.presentation.entities.customer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;
@XmlRootElement(name = "reqparamcust")
public class ReqObjCustomerList {
	
	private List<ReqObjCustomer> cl;
	private ResStatus resStatusObj ;

	public List<ReqObjCustomer> getCl() {
		if(null==this.cl){
			cl=new ArrayList<ReqObjCustomer>();
		}
		return cl;
	}

	public void setCl(List<ReqObjCustomer> cl) {
		this.cl = cl;
	}

	public ResStatus getResStatusObj() {
		return resStatusObj;
	}

	public void setResStatusObj(ResStatus resStatusObj) {
		this.resStatusObj = resStatusObj;
	}
	
}
