package org.presentation.controller.Impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.presentation.controller.Interface.RESTfulServiceInterface;
import org.presentation.entities.Customer;
import org.presentation.entities.RequestObj;
import org.presentation.entities.ResObjCust;
import org.presentation.entities.ResStatus;
import org.presentation.entities.ResponseObj;
import org.presentation.util.ServiceException;
import org.presentation.util.ServiceExceptionMapper;
import org.service.delegateService.ServiceDelegator;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Path("/mrmedservice")
public class RESTfulServiceImpl implements RESTfulServiceInterface {

	public ServiceDelegator serviceDelegator;

	@Override
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String login(RequestObj reqparam) {
		String respStr ;
		try {
System.out.println("In");
			respStr = "SUCCESS" ;
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj).toString();

		}
		return respStr;
	}

	@Override
	@POST
	@Path("/getCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResObjCust getCustomer(RequestObj reqparam) {

		ResObjCust respObj = new ResObjCust();
		
		Customer cusObj = null;
		
		ResStatus resStaObj = new ResStatus();
		
		String pno =  reqparam.getPno();
		
		if (null!=pno && pno!="" ){
			
			cusObj = new Customer();
			
			cusObj.setAdd("ShopNo 121, Kanpur");
			cusObj.setCuID("1111");
			cusObj.setCuTy("Chemist");
			cusObj.seteM("ShpNo121@gmail.com");
			cusObj.setfN("FirstName");
			cusObj.setlN("LastName");
			cusObj.setPaN("ABCD123456");
			cusObj.setPhN(pno);
			resStaObj.setStatus("SUCCESS");
			respObj.setResStatusObj(resStaObj);
			respObj.setCusObj(cusObj);
		}
		else {
			
			resStaObj.setStatus("FAILURE");
			resStaObj.setMsg("No Such Customer Exists");
			respObj.setResStatusObj(resStaObj);
			respObj.setCusObj(cusObj);
		}
/*		try {
			respObj = serviceDelegator.getCustomer(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}*/
		return respObj;

	}

	@Override
	@POST
	@Path("/saveCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String saveCustomer(RequestObj reqparam) {

/*		ResponseObj respObj = new ResponseObj();
		try {
			respObj = serviceDelegator.fetchUserCount(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;*/
		
		return "SUCCESS";
	}

	@Override
	@POST
	@Path("/stock")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj stock(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			respObj = serviceDelegator.registerUser(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}
	
	@Override
	@POST
	@Path("/updateInvoice")/*Includes update and delete*/
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj updateInvoice(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			respObj = serviceDelegator.registerUser(reqparam);
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
			respObj = serviceDelegator.registerUser(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}	

/*	@Override
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj deleteUser(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			boolean success = serviceDelegator.deleteUser(reqparam);
			if (success) {
				respObj.setErrorStatus("SUCCESS");
			} else {
				respObj.setErrorStatus("FAILURE");
				respObj.setErrorCode(ServiceConstant.GENERIC_ERROR);
			}

		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}*/

	
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

	public ServiceDelegator getServiceDelegator() {
		return serviceDelegator;
	}

	public void setServiceDelegator(ServiceDelegator serviceDelegator) {
		this.serviceDelegator = serviceDelegator;
	}

}
