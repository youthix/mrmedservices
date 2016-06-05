package org.repository.DAOImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.repository.BObjects.StockBO;
import org.repository.BObjects.SupplierBO;
import org.repository.DAOInterface.SupplierDAOInterface;
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
	public void insertSupplier(List<SupplierBO> suBOli,String dbName){

		try {
			Connection con = jdbcTemplateObject.getDataSource().getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
/*			for (StockBO sbo : sboL) {
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
			}*/
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
	public void updateSupplier(List<SupplierBO> suBOli,String dbName){
		try {
			Connection con = jdbcTemplateObject.getDataSource().getConnection();
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
/*			for (StockBO sbo : sboL) {
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
			}*/
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
	
	
	private void checkQuantity(String dbName, StockBO sbo) {
		String SQL="select * from "+dbName+".`stock` where id = '%"+sbo.getStockID()+"'";
		List<StockBO> sL=jdbcTemplateObject.query(SQL, new StockBOMapper());
		if(null != sL && null != sL.get(0) && Integer.parseInt(sL.get(0).getLeftQty())<Integer.parseInt(sbo.getLeftQty())){
			//TODO :: throw exception for isufficient quantity
		}
	}
	
	@Override
	public List<SupplierBO> searchCustomer(SupplierBO sBO,String dbName){
/*		String SQL="select * from "+dbName+".`stock` where productName like '%"+sbo.getProductID()+"%' and active='y'";
		List<StockBO> stocks=jdbcTemplateObject.query(SQL, new StockBOMapper());
		return stocks;*/
		return null;
	}	
	
}
