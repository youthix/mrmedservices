package org.presentation.controller.Interface;

import org.presentation.entities.RequestObj;
import org.presentation.entities.ResObjCust;
import org.presentation.entities.ResStatus;
import org.presentation.entities.ResponseObj;


public interface RESTfulServiceInterface {
	
	ResStatus login(RequestObj reqparam);
	
	ResObjCust getCustomer(RequestObj reqparam);
	
	ResObjCust saveCustomer(RequestObj reqparam);
	
	ResponseObj stock(RequestObj reqparam);
	
	ResponseObj updateInvoice(RequestObj reqparam);
	
	ResponseObj getInvoice(RequestObj reqparam);
	
/*	ResponseObj deleteUser(RequestObj reqparam);*/
	
}
