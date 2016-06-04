package org.repository.RepositoryDelegate;

import java.util.ArrayList;
import java.util.List;

import org.presentation.entities.company.ResObjCompany;
import org.presentation.entities.customer.ReqObjCustomer;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomer;
import org.presentation.entities.payment.ResObjPayMode;
import org.presentation.entities.purchase.ReqObjPurchase;
import org.presentation.entities.purchase.ReqObjPurchaseList;
import org.presentation.entities.purchase.ResObjPurchase;
import org.presentation.entities.sale.ReqObjSale;
import org.presentation.entities.sale.ReqObjSaleList;
import org.presentation.entities.sale.ResObjSale;
import org.presentation.entities.supplier.ReqObjSupplier;
import org.presentation.entities.supplier.ReqObjSupplierList;
import org.presentation.entities.supplier.ResObjSupplier;
import org.presentation.entities.tax.ResObjTaxation;
import org.presentation.entities.unit.ResObjUnit;
import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUser;
import org.repository.BObjects.CompanyBO;
import org.repository.BObjects.CustomerBO;
import org.repository.BObjects.PaymentModeBO;
import org.repository.BObjects.PurchaseBO;
import org.repository.BObjects.SaleBO;
import org.repository.BObjects.SupplierBO;
import org.repository.BObjects.TaxationBO;
import org.repository.BObjects.UnitBO;
import org.repository.BObjects.UserBO;
import org.repository.DAOInterface.SharedDAOInterface;
import org.repository.DAOInterface.StockDAOInterface;
import org.repository.DAOInterface.UserDAOInterface;
import org.repository.DomainConverter.DomainObjCompConverter;
import org.repository.DomainConverter.DomainObjCustConverter;
import org.repository.DomainConverter.DomainObjPaymentModeConverter;
import org.repository.DomainConverter.DomainObjSuppConverter;
import org.repository.DomainConverter.DomainObjTaxConverter;
import org.repository.DomainConverter.DomainObjUnitConverter;
import org.repository.DomainConverter.DomainObjUserConverter;
import org.repository.dbUtilities.ConnectionFactory;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.KeyGenerator;
import com.googlecode.ehcache.annotations.Property;

public class RepositoryDelegator {

	private UserDAOInterface udao;
	private SharedDAOInterface sdao;
	private StockDAOInterface stdao;
	private DomainObjUserConverter domObjUserConv;
	private DomainObjCustConverter domObjCusConv;
	private DomainObjSuppConverter domObjSuppConv;
	private DomainObjUnitConverter domObjUnitConv;
	private DomainObjCompConverter domObjCompConv;
	private DomainObjPaymentModeConverter domObjPayModeConv;
	private DomainObjTaxConverter domObjTaxConv;
	private ConnectionFactory connectionFactory;

	// @Cacheable(cacheName = "fetchPagesCache", keyGenerator =
	// @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties =
	// @Property(name = "includeMethod", value = "false") ) )

	public void saveUser(ReqObjUserList reqparam) {

		for (ReqObjUser req : reqparam.getUl()) {

			udao.saveUser(domObjUserConv.convertToBO(req), reqparam.getBid());
		}
		return;
	}

	public List<ResObjUser> getUsers(ReqObjUserList reqparam, String dbId) {

		List<UserBO> userBOls = null;

		List<ResObjUser> respObjUserls = new ArrayList<ResObjUser>();

		for (ReqObjUser reqObj : reqparam.getUl()) {

			userBOls = udao.getUsers(domObjUserConv.convertToBO(reqObj), dbId);
			respObjUserls.addAll(domObjUserConv.convertFromBOList(userBOls));
		}

		return respObjUserls;
	}

	public List<ResObjUser> doLogin(ReqObjUser req, String dbId) {
		UserBO ubo=domObjUserConv.convertToBO(req);
		List<UserBO> userBOs = udao.doLogin(ubo, dbId);
		if (null == userBOs || userBOs.size() <= 0) {
			return null;
		}
		udao.updateUserLastSeen(ubo, dbId);
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

			// custBOls = dao.getCustomer(domObjCusConv.convertToBO(req));
			// respObjCusls.addAll(domObjCusConv.convertFromBOList(custBOls));
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

			// suppBOls = dao.getSupplier(domObjSuppConv.convertToBO(req));
			// respObjSuppls.addAll(domObjSuppConv.convertFromBOList(custBOls));
		}

		return respObjSuppls;
	}

	public void saveSaleInv(ReqObjSaleList reqparam) {
		for (ReqObjSale req : reqparam.getSl()) {
			// dao.saveSupplier(domObjSuppConv.convertToBO(req),
			// "stockist_dummy");
		}

		return;
	}

	public List<ResObjSale> getSaleInv(ReqObjSaleList reqparam) {

		List<SaleBO> saBOLs = null;

		List<ResObjSale> respObjSalels = new ArrayList<ResObjSale>();

		for (ReqObjSale req : reqparam.getSl()) {

			// suppBOls = dao.getSupplier(domObjSuppConv.convertToBO(req));
			// respObjSuppls.addAll(domObjSuppConv.convertFromBOList(custBOls));
		}

		return respObjSalels;
	}

	public void savePurchaseInv(ReqObjPurchaseList reqparam) {
		for (ReqObjPurchase req : reqparam.getPu()) {
			// dao.saveSupplier(domObjSuppConv.convertToBO(req),
			// "stockist_dummy");
		}

		return;
	}

	public List<ResObjPurchase> getPurchaseInv(ReqObjPurchaseList reqparam) {

		List<PurchaseBO> puBOLs = null;

		List<ResObjPurchase> respObjPurls = new ArrayList<ResObjPurchase>();

		for (ReqObjPurchase req : reqparam.getPu()) {

			// suppBOls = dao.getSupplier(domObjSuppConv.convertToBO(req));
			// respObjSuppls.addAll(domObjSuppConv.convertFromBOList(custBOls));
		}

		return respObjPurls;
	}
	
	@Cacheable(cacheName = "payModeCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	public List<ResObjPayMode> getPaymentMode(String dbId) {
		List<PaymentModeBO> pmBOls = null;
		pmBOls = sdao.getPaymentMode(dbId);		
		return domObjPayModeConv.convertFromBOList(pmBOls);
	}

	@Cacheable(cacheName = "unitCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	public List<ResObjUnit> getUnit(String dbId) {
		List<UnitBO> uBOls = null;		
		uBOls = sdao.getUnit(dbId);		
		return domObjUnitConv.convertFromBOList(uBOls);
	}

	@Cacheable(cacheName = "taxCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	public List<ResObjTaxation> getTax(String dbId) {
		List<TaxationBO> tBOls = null;		
		tBOls = sdao.getTaxation(dbId);		
		return domObjTaxConv.convertFromBOList(tBOls);
	}
	
	@Cacheable(cacheName = "companyCache", keyGenerator = @KeyGenerator(name = "HashCodeCacheKeyGenerator", properties = @Property(name = "includeMethod", value = "false") ) )
	public List<ResObjCompany> getCompany(String dbId) {
		List<CompanyBO> cBOls = null;		
		cBOls = sdao.getCompany(dbId);		
		return domObjCompConv.convertFromBOList(cBOls);
	}

	public UserDAOInterface getUdao() {
		return udao;
	}

	public void setUdao(UserDAOInterface udao) {
		this.udao = udao;
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

	public SharedDAOInterface getSdao() {
		return sdao;
	}

	public void setSdao(SharedDAOInterface sdao) {
		this.sdao = sdao;
	}

	public DomainObjUnitConverter getDomObjUnitConv() {
		return domObjUnitConv;
	}

	public void setDomObjUnitConv(DomainObjUnitConverter domObjUnitConv) {
		this.domObjUnitConv = domObjUnitConv;
	}

	public DomainObjPaymentModeConverter getDomObjPayModeConv() {
		return domObjPayModeConv;
	}

	public void setDomObjPayModeConv(DomainObjPaymentModeConverter domObjPayModeConv) {
		this.domObjPayModeConv = domObjPayModeConv;
	}

	public DomainObjTaxConverter getDomObjTaxConv() {
		return domObjTaxConv;
	}

	public void setDomObjTaxConv(DomainObjTaxConverter domObjTaxConv) {
		this.domObjTaxConv = domObjTaxConv;
	}

	public StockDAOInterface getStdao() {
		return stdao;
	}

	public void setStdao(StockDAOInterface stdao) {
		this.stdao = stdao;
	}

	public DomainObjCompConverter getDomObjCompConv() {
		return domObjCompConv;
	}

	public void setDomObjCompConv(DomainObjCompConverter domObjCompConv) {
		this.domObjCompConv = domObjCompConv;
	}

}
