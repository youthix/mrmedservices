package org.presentation.controller.Interface;

import org.presentation.entities.RequestObj;
import org.presentation.entities.ResObjCust;
import org.presentation.entities.ResponseObj;


public interface RESTfulServiceInterface {
	
	String login(RequestObj reqparam);
	
	ResObjCust getCustomer(RequestObj reqparam);
	
	String saveCustomer(RequestObj reqparam);
	
	ResponseObj stock(RequestObj reqparam);
	
	ResponseObj updateInvoice(RequestObj reqparam);
	
	ResponseObj getInvoice(RequestObj reqparam);
	
/*	ResponseObj deleteUser(RequestObj reqparam);*/
	
}
