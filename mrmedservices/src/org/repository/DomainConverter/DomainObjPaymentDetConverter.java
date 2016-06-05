package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.customer.ResObjCustomer;
import org.presentation.entities.payment.ReqObjPayDet;
import org.presentation.entities.payment.ResObjPayDet;
import org.presentation.entities.stock.ReqObjStock;
import org.presentation.entities.stock.ResObjStock;
import org.repository.BObjects.CustomerBO;
import org.repository.BObjects.PaymentBO;
import org.repository.BObjects.StockBO;

public class DomainObjPaymentDetConverter {


	
	public List<ResObjPayDet> convertFromBOList(List<PaymentBO> pdbols) {
		List<ResObjPayDet> resList = new ArrayList<ResObjPayDet>();
		for (PaymentBO pdbo : pdbols) {
			resList.add(convertFromBO(pdbo));
		}
		return resList;
	}
	
	public List<PaymentBO> convertToBOList(List<ReqObjPayDet> reqList) {
		List<PaymentBO> pdbols = new ArrayList<PaymentBO>();
		for (ReqObjPayDet req : reqList) {
			pdbols.add(convertToBO(req));
		}
		return pdbols;
	}


	public PaymentBO convertToBO(ReqObjPayDet req) {
		PaymentBO pdbo = new PaymentBO();
		
		pdbo.setActive(req.getAct());
		pdbo.setDetails(req.getDet());
		pdbo.setModeID(req.getPmID());
		pdbo.setPayDate(req.getpDt());
		pdbo.setPayID(req.getpID());
		pdbo.setRemarks(req.getRe());
		
		return pdbo;
	}

	public ResObjPayDet convertFromBO(PaymentBO pdBObj) {

		ResObjPayDet resObjPaDt = new ResObjPayDet();
		
		resObjPaDt.setAct(pdBObj.getActive());
		resObjPaDt.setDet(pdBObj.getDetails());
		resObjPaDt.setpDt(pdBObj.getPayDate());
		resObjPaDt.setpID(pdBObj.getPayID());
		resObjPaDt.setPmID(pdBObj.getModeID());
		resObjPaDt.setRe(pdBObj.getRemarks());

		return resObjPaDt;
	}




}
