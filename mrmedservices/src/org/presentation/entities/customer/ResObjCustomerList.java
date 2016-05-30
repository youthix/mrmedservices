package org.presentation.entities.customer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparamcust")
public class ResObjCustomerList {

	
	private List<ResObjCustomer> cl;
	private ResStatus resStatus ;

	public List<ResObjCustomer> getCl() {
		if(null==this.cl){
			cl=new ArrayList<ResObjCustomer>();
		}
		return cl;
	}

	public void setCl(List<ResObjCustomer> cl) {
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
