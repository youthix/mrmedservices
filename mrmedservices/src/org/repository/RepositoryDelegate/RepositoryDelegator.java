package org.repository.RepositoryDelegate;

import java.util.List;

import org.presentation.entities.customer.ReqObjCustomer;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ResObjUser;
import org.repository.BObjects.CustomerBO;
import org.repository.BObjects.UserBO;
import org.repository.DAOInterface.UserDAOInterface;
import org.repository.DomainConverter.DomainObjConverter;
import org.repository.dbUtilities.ConnectionFactory;

public class RepositoryDelegator {

	private UserDAOInterface dao;
	private DomainObjConverter domObjConv;
	private ConnectionFactory connectionFactory;

	
	//@Cacheable(cacheName = "fetchPagesCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	

	public void saveUser(ReqObjUser req,String dbId) {		
		dao.saveUser(domObjConv.convertToBO(req),dbId);
		return;
	}
	
	public List<ResObjUser> getUsers(ReqObjUser req,String dbId) {
		List<UserBO> userBOs= dao.getUsers(domObjConv.convertToBO(req),dbId);
		return domObjConv.convertFromBOList(userBOs);
	}
	
	public List<ResObjUser> doLogin(ReqObjUser req,String dbId) {
		List<UserBO> userBOs= dao.doLogin(domObjConv.convertToBO(req),dbId);
		if(null==userBOs || userBOs.size()<=0){
			return null;
		}
		return domObjConv.convertFromBOList(userBOs);
	}

	public void saveCustomer(ReqObjCustomerList reqparam) {	
		for(ReqObjCustomer req:reqparam.getCl()){
			dao.saveUser(domObjConv.convertToBO(req),"stockist_dummy");
			}
	
		return;
	}
	
	public List<ResObjUser> getCustomer(ReqObjCustomerList reqparam) {
		
		List<CustomerBO> custBOls = null; 
		
		for(ReqObjCustomer req: reqparam.getCl()){
			if(null==users){
				users=dao.getUsers(domObjConv.convertToBO(req),"stockist_dummy");
			}
			else{
		    users.addAll(dao.getUsers(domObjConv.convertToBO(req),"stockist_dummy"));
			}
		}
		
		return doObjConv.convertFromBOList(custBOLs);
	}	
	
	public UserDAOInterface getDao() {
		return dao;
	}

	public void setDao(UserDAOInterface dao) {
		this.dao = dao;
	}

	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	public DomainObjConverter getDomObjConv() {
		return domObjConv;
	}

	public void setDomObjConv(DomainObjConverter domObjConv) {
		this.domObjConv = domObjConv;
	}


}
