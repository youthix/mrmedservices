package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.StockistBO;
import org.springframework.jdbc.core.RowMapper;

public class StockistBOMappper implements RowMapper<StockistBO>{

	@Override
	public StockistBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		StockistBO sbo= new StockistBO();
		sbo.setAdd(rs.getString("address"));
		sbo.setContNu(rs.getString("contactNumber"));
		sbo.setContPer(rs.getString("contactPerson"));
		sbo.setEmail(rs.getString("email"));
		sbo.setLicNu(rs.getString("drugLicenseNo"));
		sbo.setName(rs.getString("name"));
		sbo.setStockistID(rs.getString("stockistId"));		
		return sbo;
	}

}
