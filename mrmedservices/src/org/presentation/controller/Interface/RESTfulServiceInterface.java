package org.presentation.controller.Interface;

import org.presentation.entities.RequestObj;
import org.presentation.entities.ResponseObj;
import org.presentation.entities.company.ResObjCompanyList;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomerList;
import org.presentation.entities.payment.ResObjPayModeList;
import org.presentation.entities.purchase.ReqObjPurchaseList;
import org.presentation.entities.purchase.ResObjPurchaseList;
import org.presentation.entities.sale.ReqObjSaleList;
import org.presentation.entities.sale.ResObjSaleList;
import org.presentation.entities.supplier.ReqObjSupplierList;
import org.presentation.entities.supplier.ResObjSupplierList;
import org.presentation.entities.tax.ResObjTaxList;
import org.presentation.entities.unit.ResObjUnitList;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUserList;

public interface RESTfulServiceInterface {

	ResObjUserList login(ReqObjUserList reqparam);

/*	ResponseObj stock(RequestObj reqparam);

	ResponseObj updateInvoice(RequestObj reqparam);

	ResponseObj getInvoice(RequestObj reqparam);*/

	ResObjUserList saveUser(ReqObjUserList reqparam);

	ResObjUserList getUsers(ReqObjUserList reqparam);

	ResObjCustomerList getCustomer(ReqObjCustomerList reqparam);

	ResObjCustomerList saveCustomer(ReqObjCustomerList reqparam);
	
	ResObjSupplierList getSupplier(ReqObjSupplierList reqparam);
	
	ResObjSupplierList saveSupplier(ReqObjSupplierList reqparam);
	
	ResObjSaleList getSaleInv(ReqObjSaleList reqparam);
	
	ResObjSaleList saveSaleInv(ReqObjSaleList reqparam);
	
	ResObjPurchaseList getPurchaseInv(ReqObjPurchaseList reqparam);
	
	ResObjPurchaseList savePurchaseInv(ReqObjPurchaseList reqparam);
	
	ResObjPayModeList getPaymentMode(String busId);
	
	ResObjUnitList getUnit(String busId);
	
	ResObjTaxList getTax(String busId);
	
	ResObjCompanyList getCompany(String busId);

}
