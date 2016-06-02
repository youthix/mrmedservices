package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.payment.ResObjPayMode;
import org.repository.BObjects.PaymentModeBO;

public class DomainObjPaymentModeConverter {
	public List<ResObjPayMode> convertFromBOList(List<PaymentModeBO> pBOLs) {
		List<ResObjPayMode> resList = new ArrayList<ResObjPayMode>();
		for (PaymentModeBO pBO : pBOLs) {
			resList.add(convertFromBO(pBO));
		}
		return resList;
	}
	
	private ResObjPayMode convertFromBO(PaymentModeBO pBO){
		ResObjPayMode res=new ResObjPayMode();
		res.setAct(pBO.getActive());
		res.setmDet(pBO.getModeDet());
		res.setmID(pBO.getModeID());
		return res;
	}




}
