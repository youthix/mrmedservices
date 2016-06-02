package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.tax.ResObjTaxation;
import org.repository.BObjects.TaxationBO;

public class DomainObjTaxConverter {
	public List<ResObjTaxation> convertFromBOList(List<TaxationBO> tBOLs) {
		List<ResObjTaxation> resList = new ArrayList<ResObjTaxation>();
		for (TaxationBO tBO : tBOLs) {
			resList.add(convertFromBO(tBO));
		}
		return resList;
	}
	
	private ResObjTaxation convertFromBO(TaxationBO tBO){
		ResObjTaxation res=new ResObjTaxation();
		res.setAct(tBO.getActive());
		res.settAmt(tBO.getTaxAmt());
		res.settDet(tBO.getTaxDet());
		res.settID(tBO.getTaxID());
		return res;
	}
}
