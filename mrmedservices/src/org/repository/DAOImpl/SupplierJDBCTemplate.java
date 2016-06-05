package org.repository.DAOImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.repository.BObjects.ProductBO;
import org.repository.BObjects.StockBO;
import org.repository.DAOInterface.SupplierDAOInterface;
import org.repository.Mapper.ProductBOMapper;
import org.repository.Mapper.StockBOMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SupplierJDBCTemplate implements SupplierDAOInterface{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public void insertStock(List<StockBO> sboL,String dbName){

		try {
			Connection con = jdbcTemplateObject.getDataSource().getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			for (StockBO sbo : sboL) {
				String SQL="insert into " + dbName +".stock"
						+ " (`productId`,`batch`,`manufacturing`,`expiry`,`leftQty`,"
						+ "`buyQty`,`unitId`,`price`,`locator`) values ("
						+"'"+sbo.getProductID()+"',"
						+"'"+sbo.getBatch()+"',"
						+"'"+sbo.getMfgDt()+"',"
						+"'"+sbo.getExpDt()+"',"
						+"'"+sbo.getLeftQty()+"',"
						+"'"+sbo.getBuyQty()+"',"
						+"'"+sbo.getUnitID()+"',"
						+"'"+sbo.getPrice()+"',"
						+"'"+sbo.getLocator()+"'"
						+ ")"	;
				stmt.addBatch(SQL);
			}
			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			// Explicitly commit statements to apply changes
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@Override
	public void updateStock(List<StockBO> sboL,String dbName){
		try {
			Connection con = jdbcTemplateObject.getDataSource().getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			for (StockBO sbo : sboL) {
				String SQL="update "+ dbName +".stock set "
						+"`productId`='"+sbo.getProductID()+"',"	
						+"`batch`='"+sbo.getBatch()+"',"
						+"`manufacturing`='"+sbo.getMfgDt()+"',"
						+"`expiry`='"+sbo.getExpDt()+"',"
						+"`leftQty`='"+sbo.getLeftQty()+"',"
						+"`buyQty`='"+sbo.getBuyQty()+"',"
						+"`unitId`='"+sbo.getUnitID()+"',"
						+"`price`='"+sbo.getPrice()+"',"
						+"`active`='"+sbo.getActive()+"',"
						+"`dtUpdated`= CURRENT_TIMESTAMP,"
						+"`locator`='"+sbo.getLocator()+"' "				
						+"where id='"+sbo.getStockID()+"'";
				stmt.addBatch(SQL);
			}
			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			// Explicitly commit statements to apply changes
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void updateStockQuantity(List<StockBO> sboL,String dbName){		
			for (StockBO sbo : sboL) {				
				String SQL;
				checkQuantity(dbName, sbo);				
				SQL="update "+ dbName +".stock set "
						+"`leftQty`='"+sbo.getLeftQty()				
						+"' where id='"+sbo.getStockID()+"'";
				jdbcTemplateObject.update(SQL);
			}
	}
	
	private void checkQuantity(String dbName, StockBO sbo) {
		String SQL="select * from "+dbName+".`stock` where id = '%"+sbo.getStockID()+"'";
		List<StockBO> sL=jdbcTemplateObject.query(SQL, new StockBOMapper());
		if(null != sL && null != sL.get(0) && Integer.parseInt(sL.get(0).getLeftQty())<Integer.parseInt(sbo.getLeftQty())){
			//TODO :: throw exception for isufficient quantity
		}
	}
	
	@Override
	public void insertProduct(List<ProductBO> pboL,String dbName){		
		try {
			Connection con = jdbcTemplateObject.getDataSource().getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			for (ProductBO pbo : pboL) {
			    checkDuplicateProd(pbo);
					String SQL="insert into `mrmed_master`.`product`"
					+ " (`companyId`,`productName`,`type`,`composition`,`alternate`,"
					+ "`potency`,`pricePerUnit`,`symptoms`) values ("
					+"'"+pbo.getCompanyID()+"',"
					+"'"+pbo.getProdName()+"',"
					+"'"+pbo.getType()+"',"
					+"'"+pbo.getComposition()+"',"
					+"'"+pbo.getAlternate()+"',"
					+"'"+pbo.getPotency()+"',"
					+"'"+pbo.getPricePUnit()+"',"
					+"'"+pbo.getSymp()+"'"
					+ ")"	;
				stmt.addBatch(SQL);
			}
			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			// Explicitly commit statements to apply changes
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void checkDuplicateProd(ProductBO pbo){
		String SQL="select * from `mrmed_master`.`product` where"
				+"`companyId`='"+pbo.getCompanyID()+"' AND"	
				+"`productName`='"+pbo.getProdName()+"' AND"
				+"`type`='"+pbo.getType()+"' AND"
				+"`potency`='"+pbo.getPotency()+"'";
		List<ProductBO> prods=jdbcTemplateObject.query(SQL, new ProductBOMapper());
		if(null != prods && prods.size()>0){
			//TODO :: throw Exception for duplicate products
		}		
	}
	
	@Override
	public void updateProduct(List<ProductBO> pboL,String dbName){
		try {
			Connection con = jdbcTemplateObject.getDataSource().getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			for (ProductBO pbo : pboL) {
				checkDuplicateProd(pbo);
				String SQL="update `mrmed_master`.`product` set "
						+"`companyId`='"+pbo.getCompanyID()+"',"	
						+"`productName`='"+pbo.getProdName()+"',"
						+"`type`='"+pbo.getType()+"',"
						+"`composition`='"+pbo.getComposition()+"',"
						+"`alternate`='"+pbo.getAlternate()+"',"
						+"`potency`='"+pbo.getPotency()+"',"
						+"`pricePerUnit`='"+pbo.getPricePUnit()+"',"
						+"`symptoms`='"+pbo.getPricePUnit()+"' "
						+"where `productId`='"+pbo.getProductID()+"'";
				stmt.addBatch(SQL);
			}
			// Create an int[] to hold returned values
			int[] count = stmt.executeBatch();

			// Explicitly commit statements to apply changes
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<ProductBO> searchProduct(ProductBO pbo,String dbName){
		String SQL="select * from `mrmed_master`.`product` where productName like '%"+pbo.getProdName()+"%'";
		List<ProductBO> prods=jdbcTemplateObject.query(SQL, new ProductBOMapper());
		return prods;
	}
	
	@Override
	public List<StockBO> searchStock(StockBO sbo,String dbName){
		String SQL="select * from "+dbName+".`stock` where productName like '%"+sbo.getProductID()+"%' and active='y'";
		List<StockBO> stocks=jdbcTemplateObject.query(SQL, new StockBOMapper());
		return stocks;
	}
	
	
}
