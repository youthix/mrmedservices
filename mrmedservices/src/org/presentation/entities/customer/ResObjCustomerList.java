package org.presentation.entities.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resparamcust")
public class ResObjCustomerList {

	
	List<ResObjCustomer> cl;

	public List<ResObjCustomer> getCl() {
		if(null==this.cl){
			cl=new ArrayList<ResObjCustomer>();
		}
		return cl;
	}

	public void setCl(List<ResObjCustomer> cl) {
		this.cl = cl;
	}
	

}
