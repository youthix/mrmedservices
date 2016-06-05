package org.presentation.entities.payment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.presentation.entities.ResStatus;

@XmlRootElement(name = "resparampaydet")
public class ResObjPayDetList {

	private List<ResObjPayDet> pdl;
	private ResStatus resStatus;

	public List<ResObjPayDet> getPdl() {

		if (null == this.pdl) {
			pdl = new ArrayList<ResObjPayDet>();
		}
		return pdl;
	}

	public void setPdl(List<ResObjPayDet> pdl) {
		this.pdl = pdl;
	}

	public ResStatus getResStatus() {
		if (null == this.resStatus) {
			resStatus = new ResStatus();
		}
		return resStatus;
	}

	public void setResStatus(ResStatus resStatus) {
		this.resStatus = resStatus;
	}

}
