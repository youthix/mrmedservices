package org.presentation.controller.Interface;

import org.presentation.entities.RequestObj;
import org.presentation.entities.ResponseObj;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomerList;
import org.presentation.entities.supplier.ReqObjSupplierList;
import org.presentation.entities.supplier.ResObjSupplierList;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUserList;

public interface RESTfulServiceInterface {

	ResObjUserList login(ReqObjUserList reqparam);

	ResponseObj stock(RequestObj reqparam);

	ResponseObj updateInvoice(RequestObj reqparam);

	ResponseObj getInvoice(RequestObj reqparam);

	ResObjUserList saveUser(ReqObjUserList reqparam);

	ResObjUserList getUsers(ReqObjUserList reqparam);

	ResObjCustomerList getCustomer(ReqObjCustomerList reqparam);

	ResObjCustomerList saveCustomer(ReqObjCustomerList reqparam);
	
	ResObjSupplierList getSupplier(ReqObjSupplierList reqparam);
	
	ResObjSupplierList saveCustomer(ReqObjSupplierList reqparam);

	/* ResponseObj deleteUser(RequestObj reqparam); */

}
