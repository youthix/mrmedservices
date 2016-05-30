package org.repository.Mapper;

import org.presentation.entities.user.ReqObjUser;
import org.repository.BObjects.UserBO;

public class UserObjConverter {

	private UserBO ubo;
	private ReqObjUser reqObj;
	
	public UserBO convertToBO(ReqObjUser req){
		ubo=new UserBO();
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
	
	public ReqObjUser convertFromBO(UserBO uBObj){
		reqObj=new ReqObjUser();
		reqObj.setAct(uBObj.getActive());
		reqObj.setAdd(uBObj.getAdd());
		reqObj.setAge(uBObj.getAge());
		reqObj.setCon(uBObj.getConNu());
		reqObj.setEm(uBObj.getEmail());
		reqObj.setFn(uBObj.getfName());
		reqObj.setGen(uBObj.getGender());
		reqObj.setJd(uBObj.getjDate());
		reqObj.setLn(uBObj.getlName());
		reqObj.setLs(uBObj.getLastSeen());
		reqObj.setLst(uBObj.getLoginSt());
		reqObj.setPwd(uBObj.getPwd());
		reqObj.setRo(uBObj.getPwd());
		reqObj.setuId(uBObj.getuId());
		reqObj.setUn(uBObj.getUserName());
		return reqObj;
	}
}
