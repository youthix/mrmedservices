package org.repository.RepositoryDelegate;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.customer.ReqObjCustomer;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomer;
import org.presentation.entities.supplier.ReqObjSupplier;
import org.presentation.entities.supplier.ReqObjSupplierList;
import org.presentation.entities.supplier.ResObjSupplier;
import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUser;
import org.repository.BObjects.CustomerBO;
import org.repository.BObjects.SupplierBO;
import org.repository.BObjects.UserBO;
import org.repository.DAOInterface.UserDAOInterface;
import org.repository.DomainConverter.DomainObjCustConverter;
import org.repository.DomainConverter.DomainObjSuppConverter;
import org.repository.DomainConverter.DomainObjUserConverter;
import org.repository.dbUtilities.ConnectionFactory;

public class RepositoryDelegator {

	private UserDAOInterface dao;
	private DomainObjUserConverter domObjUserConv;
	private DomainObjCustConverter domObjCusConv;
	private DomainObjSuppConverter domObjSuppConv;
	private ConnectionFactory connectionFactory;

	// @Cacheable(cacheName = "fetchPagesCache", keyGenerator =
	// @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties =
	// @Property(name = "includeMethod", value = "false") ) )

	public void saveUser(ReqObjUserList reqparam) {

		for (ReqObjUser req : reqparam.getUl()) {
			
			dao.saveUser(domObjUserConv.convertToBO(req), reqparam.getBid());
		}
		return;
	}

	public List<ResObjUser> getUsers(ReqObjUserList reqparam, String dbId) {

		List<UserBO> userBOls = null;

		List<ResObjUser> respObjUserls = new ArrayList<ResObjUser>();

		for (ReqObjUser reqObj : reqparam.getUl()) {

			userBOls = dao.getUsers(domObjUserConv.convertToBO(reqObj), dbId);
			respObjUserls.addAll(domObjUserConv.convertFromBOList(userBOls));
		}

		return respObjUserls;
	}

	public List<ResObjUser> doLogin(ReqObjUser req, String dbId) {
		List<UserBO> userBOs = dao.doLogin(domObjUserConv.convertToBO(req), dbId);
		if (null == userBOs || userBOs.size() <= 0) {
			return null;
		}
		return domObjUserConv.convertFromBOList(userBOs);
	}

	public void saveCustomer(ReqObjCustomerList reqparam) {
		for (ReqObjCustomer req : reqparam.getCl()) {
			// dao.saveCustomer(domObjCusConv.convertToBO(req),
			// "stockist_dummy");
		}

		return;
	}

	public List<ResObjCustomer> getCustomer(ReqObjCustomerList reqparam) {

		List<CustomerBO> custBOls = null;

		List<ResObjCustomer> respObjCusls = new ArrayList<ResObjCustomer>();

		for (ReqObjCustomer req : reqparam.getCl()) {

			//custBOls = dao.getCustomer(domObjCusConv.convertToBO(req));
			//respObjCusls.addAll(domObjCusConv.convertFromBOList(custBOls));
		}

		return respObjCusls;
	}
	
	public void saveSupplier(ReqObjSupplierList reqparam) {
		for (ReqObjSupplier req : reqparam.getSl()) {
			// dao.saveSupplier(domObjSuppConv.convertToBO(req),
			// "stockist_dummy");
		}

		return;
	}

	public List<ResObjSupplier> getSupplier(ReqObjSupplierList reqparam) {

		List<SupplierBO> suppBOls = null;

		List<ResObjSupplier> respObjSuppls = new ArrayList<ResObjSupplier>();

		for (ReqObjSupplier req : reqparam.getSl()) {

			//suppBOls = dao.getSupplier(domObjSuppConv.convertToBO(req));
			//respObjSuppls.addAll(domObjSuppConv.convertFromBOList(custBOls));
		}

		return respObjSuppls;
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

	public DomainObjUserConverter getDomObjUserConv() {
		return domObjUserConv;
	}

	public void setDomObjUserConv(DomainObjUserConverter domObjUserConv) {
		this.domObjUserConv = domObjUserConv;
	}

	public DomainObjCustConverter getDomObjCusConv() {
		return domObjCusConv;
	}

	public void setDomObjCusConv(DomainObjCustConverter domObjCusConv) {
		this.domObjCusConv = domObjCusConv;
	}

	public DomainObjSuppConverter getDomObjSuppConv() {
		return domObjSuppConv;
	}

	public void setDomObjSuppConv(DomainObjSuppConverter domObjSuppConv) {
		this.domObjSuppConv = domObjSuppConv;
	}



}
