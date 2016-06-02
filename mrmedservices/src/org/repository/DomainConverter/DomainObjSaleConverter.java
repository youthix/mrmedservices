package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.sale.ReqObjSale;
import org.presentation.entities.sale.ResObjSale;
import org.repository.BObjects.SaleBO;

public class DomainObjSaleConverter {

	public List<ResObjSale> convertFromBOList(List<SaleBO> saBOLs) {
		List<ResObjSale> resList = new ArrayList<ResObjSale>();
		for (SaleBO saBO : saBOLs) {
			resList.add(convertFromBO(saBO));
		}
		return resList;
	}

	public SaleBO convertToBO(ReqObjSale req) {
		SaleBO saBO = new SaleBO();
		saBO.setActive(req.getActive());
		saBO.setAddDisc(req.getAddDisc());
		saBO.setCusID(req.getCusID());
		saBO.setDisc(req.getDisc());
		saBO.setGrossAmt(req.getGrossAmt());
		saBO.setInvDet(req.getInvDet());
		saBO.setNetAmt(req.getNetAmt());
		saBO.setPayInfo(req.getPayInfo());
		saBO.setPaymentStat(req.getPaymentStat());
		saBO.setRemarks(req.getRemarks());
		saBO.setSaleDt(req.getSaleDt());
		saBO.setStockInfo(req.getStockInfo());
		saBO.setTaxID(req.getTaxID());
		saBO.setUserName(req.getUserName());
		
		return saBO;
	}

	public ResObjSale convertFromBO(SaleBO saBO) {

		ResObjSale res = new ResObjSale();
		
		res.setActive(saBO.getActive());
		res.setAddDisc(saBO.getAddDisc());
		res.setCusID(saBO.getCusID());
		res.setDisc(saBO.getDisc());
		res.setGrossAmt(saBO.getGrossAmt());
		res.setInvDet(saBO.getInvDet());
		res.setNetAmt(saBO.getNetAmt());
		res.setPayInfo(saBO.getPayInfo());
		res.setPaymentStat(saBO.getPaymentStat());
		res.setRemarks(saBO.getRemarks());
		res.setSaleDt(saBO.getSaleDt());
		res.setSaleID(saBO.getSaleID());
		res.setStockInfo(saBO.getStockInfo());
		res.setTaxID(saBO.getTaxID());
		res.setUserName(saBO.getUserName());

		return res;
	}
}
