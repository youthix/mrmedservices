package org.presentation.controller.Interface;

import org.presentation.entities.RequestObj;
import org.presentation.entities.ResObjCust;
import org.presentation.entities.ResStatus;
import org.presentation.entities.ResponseObj;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomerList;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUserList;


public interface RESTfulServiceInterface {
	
	ResStatus login(RequestObj reqparam);
	
	ResObjCust getCustomer(RequestObj reqparam);
	
	
	ResObjCust saveCustomer(RequestObj reqparam);
	
	ResponseObj stock(RequestObj reqparam);
	
	ResponseObj updateInvoice(RequestObj reqparam);
	
	ResponseObj getInvoice(RequestObj reqparam);
	
	void saveUser(ReqObjUserList reqparam);
	ResObjUserList getUsers(ReqObjUserList reqparam);
	
	ResObjCustomerList getCustomerFromDB(ReqObjCustomerList reqparam);
	ResObjCustomerList saveCustomerInDB(ReqObjCustomerList reqparam);
	
/*	ResponseObj deleteUser(RequestObj reqparam);*/
	
}
