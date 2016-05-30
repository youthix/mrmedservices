package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.supplier.ReqObjSupplier;
import org.presentation.entities.supplier.ResObjSupplier;
import org.repository.BObjects.SupplierBO;
public class DomainObjSuppConverter {

	
	public List<ResObjSupplier> convertFromBOList(List<SupplierBO> sbos){
		List<ResObjSupplier> resList=new ArrayList<ResObjSupplier>();
		for(SupplierBO sbo:sbos){
			resList.add(convertFromBO(sbo));
		}
		return resList;		
	}
	
	public SupplierBO convertToBO(ReqObjSupplier req){
		SupplierBO sbo =new SupplierBO();
		sbo.setActive(req.getAct());
		sbo.setAdd(req.getAdd());
		sbo.setAge(req.getAge());
		sbo.setCompany(req.getComN());
		sbo.setConNu(req.getConNu());
		sbo.setContPer(req.getConPer());
		sbo.setEmail(req.getEm());;
		sbo.setfName(req.getFn());
		sbo.setGender(req.getGen());
		sbo.setjDate(req.getJd());
		sbo.setLastSeen(req.getLs());
		sbo.setlName(req.getLn());
		sbo.setlNo(req.getlNo());
		sbo.setPan(req.getPan());
		sbo.setSuppID(req.getsId());
		sbo.setSuppTy(req.getsTy());
		sbo.setTin(req.getTin());
		sbo.setuId(req.getuId());
		
		return sbo;
	}
	
	public ResObjSupplier convertFromBO(SupplierBO sBObj){
		ResObjSupplier resObj=new ResObjSupplier();
		resObj.setAct(sBObj.getActive());
		resObj.setAdd(sBObj.getAdd());
		resObj.setAge(sBObj.getAge());
		resObj.setComN(sBObj.getCompany());
		resObj.setConNu(sBObj.getConNu());
		resObj.setConPer(sBObj.getContPer());
		resObj.setEm(sBObj.getEmail());
		resObj.setFn(sBObj.getfName());
		resObj.setGen(sBObj.getGender());
		resObj.setJd(sBObj.getjDate());
		resObj.setLn(sBObj.getlName());
		resObj.setlNo(sBObj.getlNo());
		resObj.setLs(sBObj.getLastSeen());
		resObj.setPan(sBObj.getPan());
		resObj.setsId(sBObj.getSuppID());
		resObj.setsTy(sBObj.getSuppTy());
		resObj.setTin(sBObj.getTin());
		resObj.setuId(sBObj.getuId());

		return resObj;
	}
	
}
