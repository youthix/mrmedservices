package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.customer.ReqObjCustomer;
import org.presentation.entities.customer.ResObjCustomer;
import org.repository.BObjects.CustomerBO;

public class DomainObjCustConverter {

	public List<ResObjCustomer> convertFromBOList(List<CustomerBO> cubols) {
		List<ResObjCustomer> resList = new ArrayList<ResObjCustomer>();
		for (CustomerBO cubo : cubols) {
			resList.add(convertFromBO(cubo));
		}
		return resList;
	}

	public CustomerBO convertToBO(ReqObjCustomer req) {
		CustomerBO cbo = new CustomerBO();
		cbo.setActive(req.getAct());
		cbo.setAdd(req.getAdd());
		cbo.setAge(req.getAge());
		cbo.setConNu(req.getCon());
		cbo.setCusID(req.getcId());
		cbo.setCusTy(req.getcTy());
		cbo.setEmail(req.getEm());
		cbo.setfName(req.getFn());
		cbo.setGender(req.getGen());
		cbo.setjDate(req.getJd());
		cbo.setLastSeen(req.getLs());
		cbo.setlName(req.getLn());
		cbo.setlNo(req.getlNo());
		cbo.setPan(req.getPan());
		cbo.setTin(req.getTin());
		cbo.setuId(req.getuId());

		return cbo;
	}

	public ResObjCustomer convertFromBO(CustomerBO cBObj) {

		ResObjCustomer resObjCust = new ResObjCustomer();

		resObjCust.setAct(cBObj.getActive());
		resObjCust.setAdd(cBObj.getAdd());
		resObjCust.setAge(cBObj.getAge());
		resObjCust.setcId(cBObj.getCusID());
		resObjCust.setCon(cBObj.getConNu());
		resObjCust.setcTy(cBObj.getCusTy());
		resObjCust.setEm(cBObj.getEmail());
		resObjCust.setFn(cBObj.getfName());
		resObjCust.setGen(cBObj.getGender());
		resObjCust.setJd(cBObj.getjDate());
		resObjCust.setLn(cBObj.getlName());
		resObjCust.setlNo(cBObj.getlNo());
		resObjCust.setLs(cBObj.getLastSeen());
		resObjCust.setPan(cBObj.getPan());
		resObjCust.setTin(cBObj.getTin());
		resObjCust.setuId(cBObj.getuId());

		return resObjCust;
	}
}
