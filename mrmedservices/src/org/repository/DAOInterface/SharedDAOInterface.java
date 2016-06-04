package org.repository.DAOInterface;

import java.util.List;

import org.repository.BObjects.CompanyBO;
import org.repository.BObjects.PaymentModeBO;
import org.repository.BObjects.TaxationBO;
import org.repository.BObjects.UnitBO;

public interface SharedDAOInterface {

	List<TaxationBO> getTaxation(String dbName);
	
	List<UnitBO> getUnit(String dbName);
	
	List<PaymentModeBO> getPaymentMode(String dbName);
	
	List<CompanyBO> getCompany(String dbName);
	
}
