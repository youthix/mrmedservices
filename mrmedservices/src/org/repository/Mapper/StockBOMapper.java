package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.StockBO;
import org.springframework.jdbc.core.RowMapper;

public class StockBOMapper implements RowMapper<StockBO>{

	@Override
	public StockBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StockBO sbo= new StockBO();
		sbo.setActive(rs.getString("active"));
		sbo.setBatch(rs.getString("batch"));
		sbo.setExpDt(rs.getString("expiry"));
		sbo.setMfgDt(rs.getString("manufacturing"));
		sbo.setPrice(rs.getString("price"));
		sbo.setProductID(rs.getString("productId"));
		sbo.setBuyQty(rs.getString("buyQty"));
		sbo.setLeftQty(rs.getString("leftQty"));
		sbo.setLocator(rs.getString("locator"));
		sbo.setStockID(rs.getString("stockId"));
		sbo.setUnitID(rs.getString("unitId"));
		sbo.setCatID(rs.getString("catId"));
		sbo.setDtCreated(rs.getString("dtCreated"));
		sbo.setDtUpdated(rs.getString("dtUpdated"));
		return sbo;
	}

}
