package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.category.ResObjCat;
import org.presentation.entities.unit.ResObjUnit;
import org.repository.BObjects.CatBO;
import org.repository.BObjects.UnitBO;

public class DomainObjCatConverter {
	public List<ResObjCat> convertFromBOList(List<CatBO> catBOLs) {
		List<ResObjCat> resList = new ArrayList<ResObjCat>();
		for (CatBO catBO : catBOLs) {
			resList.add(convertFromBO(catBO));
		}
		return resList;
	}
	
	private ResObjCat convertFromBO(CatBO catBO){
		ResObjCat res=new ResObjCat();
		res.setAct(catBO.getActive());
		res.setCaID(catBO.getCatDet());
		res.setCatDet(catBO.getCatID());
		return res;
	}


}
