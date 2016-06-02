package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.unit.ResObjUnit;
import org.repository.BObjects.UnitBO;

public class DomainObjUnitConverter {
	public List<ResObjUnit> convertFromBOList(List<UnitBO> uBOLs) {
		List<ResObjUnit> resList = new ArrayList<ResObjUnit>();
		for (UnitBO uBO : uBOLs) {
			resList.add(convertFromBO(uBO));
		}
		return resList;
	}
	
	private ResObjUnit convertFromBO(UnitBO uBO){
		ResObjUnit res=new ResObjUnit();
		res.setAct(uBO.getActive());
		res.setuDet(uBO.getUnitDet());
		res.setuID(uBO.getUnitID());
		return res;
	}


}
