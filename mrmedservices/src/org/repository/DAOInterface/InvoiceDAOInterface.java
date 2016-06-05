package org.repository.DAOInterface;

import java.util.List;

import org.repository.BObjects.PurchaseBO;
import org.repository.BObjects.SaleBO;

public interface InvoiceDAOInterface {
		
	void insertSaleInv(List<SaleBO> salBOli,String dbName);
	
	void updateSaleInv(List<SaleBO> salBOli,String dbName);
	
	List<SaleBO> searchSaleInv(SaleBO sbo,String dbName);
	
	void insertPurInv(List<PurchaseBO> puBOli,String dbName);
	
	void updatePurInv(List<PurchaseBO> puBOli,String dbName);
	
	List<PurchaseBO> searchPurInv(PurchaseBO pubo,String dbName);
	
}
