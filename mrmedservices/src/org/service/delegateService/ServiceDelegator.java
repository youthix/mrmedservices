package org.service.delegateService;

import net.sf.ehcache.CacheManager;

import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUserList;
import org.presentation.util.ServiceException;
import org.repository.RepositoryDelegate.RepositoryDelegator;

import com.googlecode.ehcache.annotations.Cacheable;

public class ServiceDelegator {

	private RepositoryDelegator repositoryDelegator;	
	private CacheManager cacheManager;

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
	
	public ResObjUserList saveUser(ReqObjUserList reqparam) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public ResObjUserList getUser(ReqObjUserList reqparam) {
		// TODO Auto-generated method stub
		
		return null;
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
