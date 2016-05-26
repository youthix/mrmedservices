package org.presentation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
@XmlRootElement(name = "resparam")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResObjCust {

		
	private ResStatus resStatusObj ;
	private Customer cusObj;
	public ResStatus getResStatusObj() {
		return resStatusObj;
	}
	public void setResStatusObj(ResStatus resStatusObj) {
		this.resStatusObj = resStatusObj;
	}
	public Customer getCusObj() {
		return cusObj;
	}
	public void setCusObj(Customer cusObj) {
		this.cusObj = cusObj;
	}
	
	
	

}
