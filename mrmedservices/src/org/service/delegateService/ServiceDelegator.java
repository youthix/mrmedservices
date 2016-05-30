package org.service.delegateService;

import java.util.List;

import org.presentation.entities.ResStatus;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomer;
import org.presentation.entities.customer.ResObjCustomerList;
import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUser;
import org.presentation.entities.user.ResObjUserList;
import org.presentation.util.ServiceException;
import org.repository.RepositoryDelegate.RepositoryDelegator;

import com.googlecode.ehcache.annotations.Cacheable;

import net.sf.ehcache.CacheManager;

public class ServiceDelegator {

	private RepositoryDelegator repositoryDelegator;
	private CacheManager cacheManager;
	ResObjUserList res;
	ResStatus resStatus;

	@Cacheable(cacheName = "HelloCache")
	public String doHello() {
		System.out.println("Hi I am in dohello");
		return null;

	}

	public String doHelloExceptionTest() {
		System.out.println("Hi I am in dohello");
		throw new ServiceException("ExceptionTest");
		// return null;

	}

	public void saveUser(ReqObjUserList reqparam) {

		repositoryDelegator.saveUser(reqparam);

		return;
	}

	public ResObjUserList getUsers(ReqObjUserList reqparam) {
		res = new ResObjUserList();
		List<ResObjUser> users = null;

		users = repositoryDelegator.getUsers(reqparam, reqparam.getBid());
		res.setUl(users);
		return res;
	}

	public void saveCustomer(ReqObjCustomerList reqparam) {

		repositoryDelegator.saveCustomer(reqparam);

		return;
	}

	public ResObjCustomerList getCustomer(ReqObjCustomerList reqparam) {

		ResObjCustomerList res = new ResObjCustomerList();

		List<ResObjCustomer> customers = null;

		customers = repositoryDelegator.getCustomer(reqparam);

		res.setCl(customers);

		return res;
	}

	public ResObjUserList doLogin(ReqObjUserList reqparam) {
		res = new ResObjUserList();
		resStatus = res.getResStatus();
		List<ResObjUser> users = null;
		for (ReqObjUser req : reqparam.getUl()) {
			users = repositoryDelegator.doLogin(req, reqparam.getBid());
		}
		if (null != users) {
			res.setUl(users);
			resStatus.setCode("SUCCESS");
			resStatus.setMsg("Login Successful !!");
			resStatus.setStatus("SUCCESS");
		} else {
			resStatus.setCode("FAILURE");
			resStatus.setMsg("Login Unsuccessful . Please check your credentials!!");
			resStatus.setStatus("FAILURE");
		}
		return res;
	}

	public RepositoryDelegator getRepositoryDelegator() {
		return repositoryDelegator;
	}

	public void setRepositoryDelegator(RepositoryDelegator repositoryDelegator) {
		this.repositoryDelegator = repositoryDelegator;
	}

	public CacheManager getCacheManager() {
		return cacheManager;
	}

	public void setCacheManager(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}
}
