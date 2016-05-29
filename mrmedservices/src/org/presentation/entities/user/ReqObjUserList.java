package org.presentation.entities.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reqparamuser")
public class ReqObjUserList {
	
	List<ReqObjUser> ul;

	public List<ReqObjUser> getUl() {
		if(null==this.ul){
			ul=new ArrayList<ReqObjUser>();
		}
		return ul;
	}

	public void setUl(List<ReqObjUser> ul) {
		this.ul = ul;
	}
	
}
