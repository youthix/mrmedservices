package org.repository.DAOInterface;

import java.util.List;

import org.repository.BObjects.CustomerBO;

public interface CustomerDAOInterface {
		
	void insertCustomer(List<CustomerBO> cuBOli,String dbName);
	
	void updateCustomer(List<CustomerBO> cuBOli,String dbName);
	
	List<CustomerBO> searchCustomer(CustomerBO sbo,String dbName);
	
}
