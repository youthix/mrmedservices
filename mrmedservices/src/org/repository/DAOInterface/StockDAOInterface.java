package org.repository.DAOInterface;

import java.util.List;

import org.repository.BObjects.ProductBO;
import org.repository.BObjects.StockBO;

public interface StockDAOInterface {
	
	void insertStock(StockBO sbo,String dbName);
	
	void updateStock(StockBO sbo,String dbName);
	
	void insertProduct(ProductBO pbo,String dbName);
	
	void updateProduct(ProductBO pbo,String dbName);
	
	List<ProductBO> searchProduct(ProductBO pbo,String dbName);
	
	List<StockBO> searchStock(StockBO sbo,String dbName);
	
}
