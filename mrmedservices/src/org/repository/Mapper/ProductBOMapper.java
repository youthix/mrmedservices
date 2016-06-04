package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.ProductBO;
import org.springframework.jdbc.core.RowMapper;

public class ProductBOMapper implements RowMapper<ProductBO>{

	@Override
	public ProductBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ProductBO pbo= new ProductBO();
		pbo.setAlternate(rs.getString("alternate"));
		pbo.setCompanyID(rs.getString("companyId"));
		pbo.setComposition(rs.getString("composition"));
		pbo.setPotency(rs.getString("potency"));
		pbo.setPricePUnit(rs.getString("pricePerUnit"));
		pbo.setProdName(rs.getString("productName"));
		pbo.setProductID(rs.getString("productId"));
		pbo.setSymp(rs.getString("symptoms"));
		pbo.setType(rs.getString("type"));
		return pbo;
	}

}
