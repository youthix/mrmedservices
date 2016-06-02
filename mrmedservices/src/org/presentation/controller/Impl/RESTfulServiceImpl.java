package org.presentation.controller.Impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.presentation.controller.Interface.RESTfulServiceInterface;
import org.presentation.entities.RequestObj;
import org.presentation.entities.ResStatus;
import org.presentation.entities.ResponseObj;
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
import org.presentation.util.ServiceException;
import org.presentation.util.ServiceExceptionMapper;
import org.service.delegateService.ServiceDelegator;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Path("/service")
public class RESTfulServiceImpl implements RESTfulServiceInterface {

	public ServiceDelegator serviceDelegator;

	/*
	 * @Override
	 * 
	 * @POST
	 * 
	 * @Path("/getCustomer")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public ResObjCust
	 * getCustomer(RequestObj reqparam) {
	 * 
	 * ResObjCust respObj = new ResObjCust();
	 * 
	 * Customer cusObj = null;
	 * 
	 * ResStatus resStaObj = new ResStatus();
	 * 
	 * String pno = reqparam.getPno();
	 * 
	 * if (null!=pno && pno!="" ){
	 * 
	 * cusObj = new Customer();
	 * 
	 * cusObj.setAdd("ShopNo 121, Kanpur"); cusObj.setCuID("1111");
	 * cusObj.setCuTy("Chemist"); cusObj.seteM("ShpNo121@gmail.com");
	 * cusObj.setfN("FirstName"); cusObj.setlN("LastName");
	 * cusObj.setPaN("ABCD123456"); cusObj.setPhN(pno);
	 * resStaObj.setStatus("SUCCESS"); respObj.setResStatusObj(resStaObj);
	 * respObj.setCusObj(cusObj); } else {
	 * 
	 * resStaObj.setStatus("FAILURE"); resStaObj.setMsg(
	 * "No Such Customer Exists"); respObj.setResStatusObj(resStaObj);
	 * respObj.setCusObj(cusObj); } try { respObj =
	 * serviceDelegator.getCustomer(reqparam);
	 * respObj.setErrorStatus("SUCCESS"); } catch (Exception excepObj) { return
	 * ServiceExceptionMapper.toResponse(excepObj);
	 * 
	 * } return respObj;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Override
	 * 
	 * @POST
	 * 
	 * @Path("/saveCustomer")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public ResObjCust
	 * saveCustomer(RequestObj reqparam) {
	 * 
	 * ResObjCust respObj = new ResObjCust();
	 * 
	 * 
	 * ResStatus resStaObj = new ResStatus();
	 * 
	 * resStaObj.setStatus("SUCCESS"); respObj.setResStatusObj(resStaObj);
	 * 
	 * ResponseObj respObj = new ResponseObj(); try { respObj =
	 * serviceDelegator.fetchUserCount(reqparam);
	 * respObj.setErrorStatus("SUCCESS"); } catch (Exception excepObj) { return
	 * ServiceExceptionMapper.toResponse(excepObj);
	 * 
	 * } return respObj;
	 * 
	 * return respObj ; }
	 */
	@Override
	@POST
	@Path("/stock")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj stock(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			// respObj = serviceDelegator.registerUser(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}

	@Override
	@POST
	@Path("/updateInvoice") /* Includes update and delete */
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj updateInvoice(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			// respObj = serviceDelegator.registerUser(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}

	@Override
	@POST
	@Path("/getInvoice")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj getInvoice(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			// respObj = serviceDelegator.registerUser(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}


	@GET
	@Path("/hello")
	public String helloWorld() {

		try {
			serviceDelegator.doHello();
		} catch (Exception exceptionObj) {

			ServiceExceptionMapper.toResponse(exceptionObj);
		}

		return "Welcome to Code Play Service !!";
	}

	@ExceptionHandler(ServiceException.class)
	public String handleCustomException(ServiceException ex) {

		System.out.println("Hi");
		return "In Exception Handler";

	}

	
	@Override
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjUserList login(ReqObjUserList reqparam) {
		return serviceDelegator.doLogin(reqparam);
	}
	
	@Override
	@POST
	@Path("/save/user") /* Includes create and update */
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjUserList saveUser(ReqObjUserList reqparam) {

		ResObjUserList res = new ResObjUserList();
		ResStatus respStObj = new ResStatus();
		serviceDelegator.saveUser(reqparam);
		respStObj.setStatus("SUCCESS");
		respStObj.setCode("SUCCESS");
		respStObj.setMsg("NO error occured while processing this transation !");
		res.setResStatus(respStObj);
		return res;
	}

	@Override
	@POST
	@Path("/get/user")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjUserList getUsers(ReqObjUserList reqparam) {
		ResObjUserList res = serviceDelegator.getUsers(reqparam);
		ResStatus resStatus = res.getResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		return res;
	}

	@Override
	@POST
	@Path("/get/customer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjCustomerList getCustomer(ReqObjCustomerList reqparam) {

		ResObjCustomerList res = serviceDelegator.getCustomer(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);

		return res;
	}

	@Override
	@POST
	@Path("/save/customer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	/* Includes create and update */
	public ResObjCustomerList saveCustomer(ReqObjCustomerList reqparam) {
		ResObjCustomerList res = new ResObjCustomerList();

		serviceDelegator.saveCustomer(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);

		return res;
	}


	@Override
	@POST
	@Path("/get/supplier")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjSupplierList getSupplier(ReqObjSupplierList reqparam) {

		ResObjSupplierList res = serviceDelegator.getSupplier(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);

		return res;
	}

	@Override
	@POST
	@Path("/save/supplier")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	/* Includes create and update */
	public ResObjSupplierList saveSupplier(ReqObjSupplierList reqparam) {
		ResObjSupplierList res = new ResObjSupplierList();

		serviceDelegator.saveSupplier(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);

		return res;
	}
	
	@Override
	@POST
	@Path("/get/saleInv")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjSaleList getSaleInv(ReqObjSaleList reqparam) {

/*		ResObjSupplierList res = serviceDelegator.getSupplier(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);*/

		return null;
	}

	@Override
	@POST
	@Path("/save/saleInv")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	/* Includes create and update */
	public ResObjSaleList saveSaleInv(ReqObjSaleList reqparam) {
		ResObjSaleList res = new ResObjSaleList();

/*		serviceDelegator.saveSupplier(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);*/

		return res;
	}	
	
	@Override
	@POST
	@Path("/get/purchaseInv")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjPurchaseList getPurchaseInv(ReqObjPurchaseList reqparam) {

/*		ResObjSupplierList res = serviceDelegator.getSupplier(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);*/

		return null;
	}

	@Override
	@POST
	@Path("/save/purchaseInv")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	/* Includes create and update */
	public ResObjPurchaseList savePurchaseInv(ReqObjPurchaseList reqparam) {
		ResObjPurchaseList res = new ResObjPurchaseList();

/*		serviceDelegator.saveSupplier(reqparam);

		ResStatus resStatus = new ResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
		res.setResStatus(resStatus);*/

		return res;
	}
	
	public ServiceDelegator getServiceDelegator() {
		return serviceDelegator;
	}

	public void setServiceDelegator(ServiceDelegator serviceDelegator) {
		this.serviceDelegator = serviceDelegator;
	}

	@Override
	@GET
	@Path("/get/payment/mode")
	@Produces(MediaType.APPLICATION_JSON)	
	public ResObjPayModeList getPaymentMode(@QueryParam("busId") String busId) {
		// TODO Auto-generated method stub
		return serviceDelegator.getPaymentMode(busId);
	}

	@Override
	@GET
	@Path("/get/unit")
	@Produces(MediaType.APPLICATION_JSON)
	public ResObjUnitList getUnit(@QueryParam("busId") String busId) {
		// TODO Auto-generated method stub
		return serviceDelegator.getUnit(busId);
	}

	@Override
	@GET
	@Path("/get/tax")
	@Produces(MediaType.APPLICATION_JSON)
	public ResObjTaxList getTax(@QueryParam("busId") String busId) {
		// TODO Auto-generated method stub
		return serviceDelegator.getTax(busId);
	}	

}
