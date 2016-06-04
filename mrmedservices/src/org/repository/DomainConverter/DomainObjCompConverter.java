package org.repository.DomainConverter;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.company.ResObjCompany;
import org.repository.BObjects.CompanyBO;

public class DomainObjCompConverter {
	public List<ResObjCompany> convertFromBOList(List<CompanyBO> cBOLs) {
		List<ResObjCompany> resList = new ArrayList<ResObjCompany>();
		for (CompanyBO cBO : cBOLs) {
			resList.add(convertFromBO(cBO));
		}
		return resList;
	}
	
	private ResObjCompany convertFromBO(CompanyBO cBO){
		ResObjCompany res=new ResObjCompany();
		res.setcID(cBO.getComID());
		res.setcName(cBO.getComName());
		res.setcNo(cBO.getContNo());
		res.setcPer(cBO.getContPerson());
		res.setcURL(cBO.getComURL());
		res.setEmail(cBO.getEmail());		
		res.setLogo(cBO.getLogo());
		res.setProf(cBO.getProfile());
		return res;
	}
}
