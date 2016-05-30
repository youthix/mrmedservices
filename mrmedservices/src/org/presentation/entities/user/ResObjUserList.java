package org.presentation.entities.user;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement(name = "resparamuser")
public class ResObjUserList {
	
	List<ResObjUser> ul;

	public List<ResObjUser> getUl() {
		if(null==this.ul){
			ul=new ArrayList<ResObjUser>();
		}
		return ul;
	}

	public void setUl(List<ResObjUser> ul) {
		this.ul = ul;
	}
	
}
