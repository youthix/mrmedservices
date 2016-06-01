package org.presentation.entities.purchase;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparampurchase")
public class ResObjPurchaseList {
	
	List<ResObjPurchase> pl;
	ResStatus resStatus;


	public List<ResObjPurchase> getPl() {
		return pl;
	}

	public void setPl(List<ResObjPurchase> pl) {
		this.pl = pl;
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
