package org.repository.DAOImpl;

import java.util.List;

import javax.sql.DataSource;

import org.repository.BObjects.ProductBO;
import org.repository.BObjects.StockBO;
import org.repository.DAOInterface.StockDAOInterface;
import org.repository.Mapper.ProductBOMapper;
import org.repository.Mapper.StockBOMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StockJDBCTemplate implements StockDAOInterface{
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
	public void insertStock(StockBO sbo,String dbName){
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
		jdbcTemplateObject.update(SQL);
	}
	@Override
	public void updateStock(StockBO sbo,String dbName){
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
				+"`locator`='"+sbo.getLocator()+"' "				
				+"where id='"+sbo.getStockID()+"'";
		jdbcTemplateObject.update(SQL);
	}
	@Override
	public void insertProduct(ProductBO pbo,String dbName){
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
		jdbcTemplateObject.update(SQL);
	}
	@Override
	public void updateProduct(ProductBO pbo,String dbName){
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
		jdbcTemplateObject.update(SQL);
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
