package org.repository.RepositoryDelegate;

import java.util.List;

import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ResObjUser;
import org.repository.BObjects.UserBO;
import org.repository.DAOInterface.UserDAOInterface;
import org.repository.DomainConverter.UserObjConverter;
import org.repository.dbUtilities.ConnectionFactory;

public class RepositoryDelegator {

	private UserDAOInterface dao;
	private UserObjConverter userObjConv;
	private ConnectionFactory connectionFactory;

	
	//@Cacheable(cacheName = "fetchPagesCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	

	public void saveUser(ReqObjUser req,String dbId) {		
		dao.saveUser(userObjConv.convertToBO(req),dbId);
		return;
	}
	
	public List<ResObjUser> getUsers(ReqObjUser req,String dbId) {
		List<UserBO> userBOs= dao.getUsers(userObjConv.convertToBO(req),dbId);
		return userObjConv.convertFromBOList(userBOs);
	}
	
	public List<ResObjUser> doLogin(ReqObjUser req,String dbId) {
		List<UserBO> userBOs= dao.doLogin(userObjConv.convertToBO(req),dbId);
		if(null==userBOs || userBOs.size()<=0){
			return null;
		}
		return userObjConv.convertFromBOList(userBOs);
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

	public UserObjConverter getUserObjConv() {
		return userObjConv;
	}

	public void setUserObjConv(UserObjConverter userObjConv) {
		this.userObjConv = userObjConv;
	}
}
