package org.presentation.entities.category;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.ResStatus;

public class ResObjCatList {
	List<ResObjCat> catl;
	ResStatus resStatus;

	public ResStatus getResStatus() {
		if (null == this.resStatus) {
			resStatus = new ResStatus();
		}
		return resStatus;
	}

	public List<ResObjCat> getCatl() {

		if (null == this.catl) {
			this.catl = new ArrayList<ResObjCat>();
		}
		return catl;
	}

	public void setCatl(List<ResObjCat> catl) {
		this.catl = catl;
	}

	public void setResStatus(ResStatus resStatus) {
		this.resStatus = resStatus;
	}
}
