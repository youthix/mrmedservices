package org.repository.RepositoryDelegate;

import java.util.List;

import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ResObjUser;
import org.repository.BObjects.UserBO;
import org.repository.DAOInterface.UserDAOInterface;
import org.repository.Mapper.UserObjConverter;
import org.repository.dbUtilities.ConnectionFactory;

public class RepositoryDelegator {

	private UserDAOInterface dao;
	private UserObjConverter userObjConv;
	private ConnectionFactory connectionFactory;

	
	//@Cacheable(cacheName = "fetchPagesCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	
	public void saveUser(ReqObjUser req) {
		dao.saveUser(userObjConv.convertToBO(req),"stockist_dummy");
		return;
	}
	
	public List<ResObjUser> getUsers(ReqObjUser req) {
		List<UserBO> userBOs= dao.getUsers(userObjConv.convertToBO(req),"stockist_dummy");
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

}
