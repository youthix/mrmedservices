package org.presentation.controller.Impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.presentation.controller.Interface.RESTfulServiceInterface;
import org.presentation.entities.RequestObj;
import org.presentation.entities.ResponseObj;
import org.presentation.util.ServiceConstant;
import org.presentation.util.ServiceException;
import org.presentation.util.ServiceExceptionMapper;
import org.service.delegateService.ServiceDelegator;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Path("/hotornot")
public class RESTfulServiceImpl implements RESTfulServiceInterface {

	public ServiceDelegator serviceDelegator;

	@Override
	@POST
	@Path("/pages")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj fetchPages(RequestObj reqparam) {
		ResponseObj respObj = new ResponseObj();
		try {
			respObj = serviceDelegator.fetchPages(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}

	@Override
	@POST
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj fetchUsers(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			respObj = serviceDelegator.fetchUsers(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;

	}

	@Override
	@POST
	@Path("/users-count")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj fetchUserCount(RequestObj reqparam) {

		ResponseObj respObj = new ResponseObj();
		try {
			respObj = serviceDelegator.fetchUserCount(reqparam);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}

	@Override
	@POST
	@Path("/register")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseObj registerUser(RequestObj reqparam) {

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
	@Path("/index")
	@Produces(MediaType.APPLICATION_JSON)
	public String doIndexing(@FormParam("username") String username, @FormParam("password") String password,
			@FormParam("dbQualifiers") String dbQualifiers) {
		return serviceDelegator.doIndexing(username, password, dbQualifiers);
	}

	@Override
	@POST
	@Path("/logout")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseObj logout(@FormParam("fbID") String fbId) {

		ResponseObj respObj = new ResponseObj();
		try {
			serviceDelegator.logout(fbId);
			respObj.setErrorStatus("SUCCESS");
		} catch (Exception excepObj) {
			return ServiceExceptionMapper.toResponse(excepObj);

		}
		return respObj;
	}

	@Override
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
	}

	@Override
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
