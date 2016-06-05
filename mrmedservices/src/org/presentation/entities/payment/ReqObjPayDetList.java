package org.presentation.entities.payment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;
@XmlRootElement(name = "reqparampaydet")
public class ReqObjPayDetList {
	
	private List<ReqObjPayDet> pdl;
	
	public List<ReqObjPayDet> getPdl() {
		
		if(null==this.pdl){
			pdl=new ArrayList<ReqObjPayDet>();
		}		
		return pdl;
	}

	public void setPdl(List<ReqObjPayDet> pdl) {
		this.pdl = pdl;
	}


	
}
