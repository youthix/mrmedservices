package org.presentation.entities.customer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "reqparamcust")
public class ReqObjCustomerList {
	
	List<ReqObjCustomer> cl;

	public List<ReqObjCustomer> getCl() {
		if(null==this.cl){
			cl=new ArrayList<ReqObjCustomer>();
		}
		return cl;
	}

	public void setCl(List<ReqObjCustomer> cl) {
		this.cl = cl;
	}
	
}
