package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.stock.ReqObjStock;
import org.presentation.entities.stock.ResObjStock;
import org.repository.BObjects.StockBO;

public class DomainObjStockConverter {


	public List<ResObjStock> convertFromBOList(List<ResObjStock> resList,List<StockBO> sbols) {
		List<ResObjStock> resListFinal=new ArrayList<ResObjStock>();
		for (StockBO sbo : sbols) {
			convertFromBO(resListFinal,resList,sbo);
		}
		return resListFinal;
	}
	
	public List<StockBO> convertToBOList(List<ReqObjStock> reqList) {
		List<StockBO> sbols = new ArrayList<StockBO>();
		for (ReqObjStock req : reqList) {
			sbols.add(convertToBO(req));
		}
		return sbols;
	}


	public StockBO convertToBO(ReqObjStock req) {
		StockBO sbo = new StockBO();
		sbo.setActive(req.getAct());
		sbo.setBatch(req.getBat());
		sbo.setBuyQty(req.getbQty());
		sbo.setExpDt(req.getExpDt());
		sbo.setLeftQty(req.getlQty());
		sbo.setLocator(req.getLoc());
		sbo.setMfgDt(req.getMfgDt());
		sbo.setPrice(req.getPrice());
		sbo.setProductID(req.getpID());
		sbo.setStockID(req.getsID());
		sbo.setUnitID(req.getUnID());
		sbo.setCatID(req.getCatID());
		return sbo;
	}

	public void convertFromBO(List<ResObjStock> resListFinal,List<ResObjStock> resList,StockBO sBObj) {
		

		for(ResObjStock resObj:resList){
		if(resObj.getpID().equalsIgnoreCase(sBObj.getProductID())){
			resObj.setAct(sBObj.getActive());
			resObj.setBat(sBObj.getBatch());
			resObj.setbQty(sBObj.getBuyQty());
			resObj.setExpDt(sBObj.getExpDt());
			resObj.setlQty(sBObj.getLeftQty());
			resObj.setLoc(sBObj.getLocator());
			resObj.setMfgDt(sBObj.getMfgDt());
			resObj.setPrice(sBObj.getPrice());
			resObj.setpID(sBObj.getProductID());
			resObj.setsID(sBObj.getStockID());
			resObj.setUnID(sBObj.getUnitID());
			resObj.setDtCrt(sBObj.getDtCreated());
			resObj.setDtUpd(sBObj.getDtUpdated());
			resObj.setCatID(sBObj.getCatID());
			resListFinal.add(resObj);
		  }
		}
		return;
	}


}
