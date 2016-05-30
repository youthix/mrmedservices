package org.service.delegateService;

import java.util.List;

import net.sf.ehcache.CacheManager;

import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUser;
import org.presentation.entities.user.ResObjUserList;
import org.presentation.util.ServiceException;
import org.repository.BObjects.UserBO;
import org.repository.RepositoryDelegate.RepositoryDelegator;

import com.googlecode.ehcache.annotations.Cacheable;

public class ServiceDelegator {

	private RepositoryDelegator repositoryDelegator;	
	private CacheManager cacheManager;
	ResObjUserList res;

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
		for(ReqObjUser req:reqparam.getUl()){
		 repositoryDelegator.saveUser(req);
		}	
		return;
	}
	
	public ResObjUserList getUsers(ReqObjUserList reqparam) {
		res=new ResObjUserList();
		List<ResObjUser> users = null;
		for(ReqObjUser req: reqparam.getUl()){
			if(null==users){
				users=repositoryDelegator.getUsers(req);
			}
			else{
		    users.addAll(repositoryDelegator.getUsers(req));
			}
		}
		res.setUl(users);
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
