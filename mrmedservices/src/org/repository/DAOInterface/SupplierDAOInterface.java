package org.repository.DAOInterface;

import java.util.List;

import org.repository.BObjects.SupplierBO;

public interface SupplierDAOInterface {
		
	void insertSupplier(List<SupplierBO> suBOli,String dbName);
	
	void updateSupplier(List<SupplierBO> suBOli,String dbName);
	
	List<SupplierBO> searchCustomer(SupplierBO sBO,String dbName);
	
	
}
