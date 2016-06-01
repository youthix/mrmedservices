package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.purchase.ReqObjPurchase;
import org.presentation.entities.purchase.ResObjPurchase;
import org.repository.BObjects.PurchaseBO;

public class DomainObjPurchaseConverter {

	public List<ResObjPurchase> convertFromBOList(List<PurchaseBO> purBOLs) {
		List<ResObjPurchase> resList = new ArrayList<ResObjPurchase>();
		for (PurchaseBO purBO : purBOLs) {
			resList.add(convertFromBO(purBO));
		}
		return resList;
	}

	public PurchaseBO convertToBO(ReqObjPurchase req) {
		
		PurchaseBO purBO = new PurchaseBO();
		
		purBO.setActive(req.getActive());
		purBO.setAddDisc(req.getAddDisc());
		purBO.setDisc(req.getDisc());
		purBO.setGrossAmt(req.getGrossAmt());
		purBO.setInvDet(req.getInvDet());
		purBO.setNetAmt(req.getNetAmt());
		purBO.setPayInfo(req.getPayInfo());
		purBO.setPaymentStat(req.getPaymentStat());
		purBO.setPurDt(req.getPurDt());
		purBO.setPurID(req.getPurID());
		purBO.setRemarks(req.getRemarks());
		purBO.setStockInfo(req.getStockInfo());
		purBO.setSuppID(req.getSuppID());
		purBO.setTaxID(req.getTaxID());
		purBO.setUserName(req.getUserName());

		return purBO;
	}

	public ResObjPurchase convertFromBO(PurchaseBO purBO) {

		ResObjPurchase res = new ResObjPurchase();
		
		res.setActive(purBO.getActive());
		res.setAddDisc(purBO.getAddDisc());
		res.setDisc(purBO.getDisc());
		res.setGrossAmt(purBO.getGrossAmt());
		res.setInvDet(purBO.getInvDet());
		res.setNetAmt(purBO.getNetAmt());
		res.setPayInfo(purBO.getPayInfo());
		res.setPaymentStat(purBO.getPaymentStat());
		res.setPurDt(purBO.getPurDt());
		res.setPurID(purBO.getPurID());
		res.setRemarks(purBO.getRemarks());
		res.setStockInfo(purBO.getStockInfo());
		res.setSuppID(purBO.getSuppID());
		res.setTaxID(purBO.getTaxID());
		res.setUserName(purBO.getUserName());

		return res;
	}
}
