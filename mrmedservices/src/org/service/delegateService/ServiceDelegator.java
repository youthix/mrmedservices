package org.service.delegateService;

import java.util.List;

import net.sf.ehcache.CacheManager;

import org.presentation.entities.ResStatus;
import org.presentation.entities.company.ResObjCompanyList;
import org.presentation.entities.customer.ReqObjCustomerList;
import org.presentation.entities.customer.ResObjCustomer;
import org.presentation.entities.customer.ResObjCustomerList;
import org.presentation.entities.payment.ResObjPayModeList;
import org.presentation.entities.purchase.ReqObjPurchaseList;
import org.presentation.entities.purchase.ResObjPurchase;
import org.presentation.entities.purchase.ResObjPurchaseList;
import org.presentation.entities.sale.ReqObjSaleList;
import org.presentation.entities.sale.ResObjSale;
import org.presentation.entities.sale.ResObjSaleList;
import org.presentation.entities.stock.ReqObjectStockList;
import org.presentation.entities.stock.ResObjStockList;
import org.presentation.entities.supplier.ReqObjSupplierList;
import org.presentation.entities.supplier.ResObjSupplier;
import org.presentation.entities.supplier.ResObjSupplierList;
import org.presentation.entities.tax.ResObjTaxList;
import org.presentation.entities.unit.ResObjUnitList;
import org.presentation.entities.user.ReqObjUser;
import org.presentation.entities.user.ReqObjUserList;
import org.presentation.entities.user.ResObjUser;
import org.presentation.entities.user.ResObjUserList;
import org.presentation.util.ServiceException;
import org.repository.RepositoryDelegate.RepositoryDelegator;

import com.googlecode.ehcache.annotations.Cacheable;

public class ServiceDelegator {

	private RepositoryDelegator repositoryDelegator;
	private CacheManager cacheManager;
	ResObjUserList res;
	ResObjTaxList resT;
	ResObjUnitList resU;
	ResObjPayModeList resPM;
	ResObjCompanyList resCo;
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

	public ResObjUserList saveUser(ReqObjUserList reqparam) {		
		ResObjUserList res = new ResObjUserList();
		ResStatus respStObj = new ResStatus();
		repositoryDelegator.saveUser(reqparam);
		respStObj.setStatus("SUCCESS");
		respStObj.setCode("SUCCESS");
		respStObj.setMsg("NO error occured while processing this transation !");
		res.setResStatus(respStObj);
		return res;
	}
	
	public ResObjStockList addStock(ReqObjectStockList reqList,String dbName){			
		ResObjStockList res = new ResObjStockList();
		ResStatus respStObj = new ResStatus();
		repositoryDelegator.addStock(reqList, dbName);	
		respStObj.setStatus("SUCCESS");
		respStObj.setCode("SUCCESS");
		respStObj.setMsg("NO error occured while processing this transation !");
		res.setResStatus(respStObj);
		return res;
	}
	
	public ResObjStockList updateStock(ReqObjectStockList reqList,String dbName){		
		ResObjStockList res = new ResObjStockList();
		ResStatus respStObj = new ResStatus();
		repositoryDelegator.updateStock(reqList, dbName);	
		respStObj.setStatus("SUCCESS");
		respStObj.setCode("SUCCESS");
		respStObj.setMsg("NO error occured while processing this transation !");
		res.setResStatus(respStObj);
		return res;
	}
	
	public ResObjStockList addProduct(ReqObjectStockList reqList,String dbName){		
		ResObjStockList res = new ResObjStockList();
		ResStatus respStObj = new ResStatus();
		repositoryDelegator.addProduct(reqList, dbName);		
		respStObj.setStatus("SUCCESS");
		respStObj.setCode("SUCCESS");
		respStObj.setMsg("NO error occured while processing this transation !");
		res.setResStatus(respStObj);
		return res;
	}
	
	public ResObjStockList updateProduct(ReqObjectStockList reqList,String dbName){			
		ResObjStockList res = new ResObjStockList();
		ResStatus respStObj = new ResStatus();
		repositoryDelegator.updateProduct(reqList, dbName);		
		respStObj.setStatus("SUCCESS");
		respStObj.setCode("SUCCESS");
		respStObj.setMsg("NO error occured while processing this transation !");
		res.setResStatus(respStObj);	
		return res;
	}
	

	public ResObjUserList getUsers(ReqObjUserList reqparam) {
		res = new ResObjUserList();
		List<ResObjUser> users = null;
		users = repositoryDelegator.getUsers(reqparam, reqparam.getBid());
		res.setUl(users);
		ResStatus resStatus = res.getResStatus();
		resStatus.setStatus("SUCCESS");
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Users successfully fetched !");
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
	
	public void saveSupplier(ReqObjSupplierList reqparam) {

		repositoryDelegator.saveSupplier(reqparam);

		return;
	}

	public ResObjSupplierList getSupplier(ReqObjSupplierList reqparam) {

		ResObjSupplierList res = new ResObjSupplierList();

		List<ResObjSupplier> suppliers = null;

		suppliers = repositoryDelegator.getSupplier(reqparam);

		res.setSl(suppliers);

		return res;
	}	
	
	public void saveSaleInv(ReqObjSaleList reqparam) {

		//repositoryDelegator.saveSupplier(reqparam);

		return;
	}

	public ResObjSaleList getSaleInv(ReqObjSaleList reqparam) {

		ResObjSaleList res = new ResObjSaleList();

		List<ResObjSale> sl = null;

		//sl = repositoryDelegator.getSupplier(reqparam);
		
		res.setSl(sl);

		return res;
	}
	
	public void savePurchaseInv(ReqObjPurchaseList reqparam) {

		//repositoryDelegator.saveSupplier(reqparam);

		return;
	}

	public ResObjPurchaseList getPurchaseInv(ReqObjPurchaseList reqparam) {

		ResObjPurchaseList res = new ResObjPurchaseList();

		List<ResObjPurchase> pl = null;

		//sl = repositoryDelegator.getSupplier(reqparam);
		
		res.setPl(pl);

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
	
	
	public ResObjPayModeList getPaymentMode(String busId) {
		resPM= new ResObjPayModeList();		
		resStatus = resPM.getResStatus();
		resPM.setPml(repositoryDelegator.getPaymentMode(busId));
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Successful !!");
		resStatus.setStatus("SUCCESS");
		return resPM;
	}

	
	public ResObjUnitList getUnit(String busId) {
		resU= new ResObjUnitList();		
		resStatus = resU.getResStatus();
		resU.setUl(repositoryDelegator.getUnit(busId));
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Successful !!");
		resStatus.setStatus("SUCCESS");
		return resU;
	}

	
	public ResObjTaxList getTax(String busId) {
		resT= new ResObjTaxList();		
		resStatus = resT.getResStatus();
		resT.setTl(repositoryDelegator.getTax(busId));
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Successful !!");
		resStatus.setStatus("SUCCESS");
		return resT;
	}
	
	public ResObjCompanyList getCompany(String busId) {
		resCo= new ResObjCompanyList();		
		resStatus = resCo.getResStatus();
		resCo.setCl(repositoryDelegator.getCompany(busId));
		resStatus.setCode("SUCCESS");
		resStatus.setMsg("Successful !!");
		resStatus.setStatus("SUCCESS");
		return resCo;
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
