package org.repository.DAOInterface;

import java.util.List;

import org.repository.BObjects.ProductBO;
import org.repository.BObjects.StockBO;

public interface CustomerDAOInterface {
		
	void insertStock(List<StockBO> sboL,String dbName);
	
	void updateStock(List<StockBO> sboL,String dbName);
	
	void updateStockQuantity(List<StockBO> sboL,String dbName);
	
	void insertProduct(List<ProductBO> pboL,String dbName);
	
	void updateProduct(List<ProductBO> pboL,String dbName);
	
	List<ProductBO> searchProduct(ProductBO pbo,String dbName);
	
	List<StockBO> searchStock(StockBO sbo,String dbName);
	
}
