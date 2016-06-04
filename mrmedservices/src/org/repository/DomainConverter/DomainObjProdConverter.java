package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.stock.ReqObjStock;
import org.presentation.entities.stock.ResObjStock;
import org.repository.BObjects.ProductBO;
import org.repository.BObjects.StockBO;

public class DomainObjProdConverter {


	public List<ResObjStock> convertFromBOList(List<ResObjStock> resList,List<ProductBO> pbols) {		
		for (ProductBO pbo : pbols) {
			resList.add(convertFromBO(pbo));
		}
		return resList;
	}
	
	public List<ProductBO> convertToBOList(List<ReqObjStock> reqList) {
		List<ProductBO> pbols = new ArrayList<ProductBO>();
		for (ReqObjStock req : reqList) {
			pbols.add(convertToBO(req));
		}
		return pbols;
	}


	public ProductBO convertToBO(ReqObjStock req) {
		ProductBO pbo = new ProductBO();
		pbo.setAlternate(req.getAlt());
		pbo.setCompanyID(req.getcID());
		pbo.setComposition(req.getComp());
		pbo.setPotency(req.getPot());
		pbo.setPricePUnit(req.getPpUnit());
		pbo.setProdName(req.getName());
		pbo.setProductID(req.getpID());
		pbo.setSymp(req.getSymp());
		pbo.setType(req.getType());
		return pbo;
	}

	public ResObjStock convertFromBO(ProductBO pBObj) {
		ResObjStock resObj = new ResObjStock();
		resObj.setAlt(pBObj.getAlternate());
		resObj.setcID(pBObj.getCompanyID());
		resObj.setComp(pBObj.getComposition());
		resObj.setPot(pBObj.getPotency());
		resObj.setPpUnit(pBObj.getPricePUnit());
		resObj.setName(pBObj.getProdName());
		resObj.setpID(pBObj.getProductID());
		resObj.setSymp(pBObj.getSymp());
		resObj.setType(pBObj.getType());
		return resObj;
	}


}
