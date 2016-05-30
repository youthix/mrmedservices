package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.customer.ReqObjCustomer;
import org.presentation.entities.customer.ResObjCustomer;
import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ResObjUser;
import org.repository.BObjects.CustomerBO;
import org.repository.BObjects.UserBO;
public class DomainObjUserConverter {


	
	public List<ResObjUser> convertFromBOList(List<UserBO> ubos){
		List<ResObjUser> resList=new ArrayList<ResObjUser>();
		for(UserBO ubo:ubos){
			resList.add(convertFromBO(ubo));
		}
		return resList;		
	}
	
	public UserBO convertToBO(ReqObjUser req){
		UserBO ubo=new UserBO();
		ubo.setActive(req.getAct());
		ubo.setAdd(req.getAdd());
		ubo.setAge(req.getAge());
		ubo.setConNu(req.getCon());
		ubo.setEmail(req.getEm());
		ubo.setfName(req.getFn());
		ubo.setGender(req.getGen());
		ubo.setjDate(req.getJd());
		ubo.setLastSeen(req.getLs());
		ubo.setlName(req.getLn());
		ubo.setLoginSt(req.getLst());
		ubo.setPwd(req.getPwd());
		ubo.setRole(req.getRo());
		ubo.setuId(req.getuId());
		ubo.setUserName(req.getUn());
		return ubo;
	}
	
	public ResObjUser convertFromBO(UserBO uBObj){
		ResObjUser resObj=new ResObjUser();
		resObj.setAct(uBObj.getActive());
		resObj.setAdd(uBObj.getAdd());
		resObj.setAge(uBObj.getAge());
		resObj.setCon(uBObj.getConNu());
		resObj.setEm(uBObj.getEmail());
		resObj.setFn(uBObj.getfName());
		resObj.setGen(uBObj.getGender());
		resObj.setJd(uBObj.getjDate());
		resObj.setLn(uBObj.getlName());
		resObj.setLs(uBObj.getLastSeen());
		resObj.setLst(uBObj.getLoginSt());
		resObj.setPwd(uBObj.getPwd());
		resObj.setRo(uBObj.getPwd());
		resObj.setuId(uBObj.getuId());
		resObj.setUn(uBObj.getUserName());
		return resObj;
	}
	
}
