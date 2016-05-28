package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.SaleBO;
import org.springframework.jdbc.core.RowMapper;

public class SaleBOMapper implements RowMapper<SaleBO>{

	@Override
	public SaleBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		SaleBO sbo= new SaleBO();
		sbo.setActive(rs.getString("active"));
		sbo.setAddDisc(rs.getString("addDiscount"));
		sbo.setCusID(rs.getString("customerId"));
		sbo.setDisc(rs.getString("discount"));
		sbo.setGrossAmt(rs.getString("grossAmount"));
		sbo.setInvDet(rs.getString("invDetails"));
		sbo.setNetAmt(rs.getString("netAmount"));
		sbo.setPayInfo(rs.getString("paymentInfo"));
		sbo.setPaymentStat(rs.getString("paymentStatus"));
		sbo.setRemarks(rs.getString("remarks"));
		sbo.setSaleDt(rs.getString("saleDate"));
		sbo.setSaleID(rs.getString("saleId"));
		sbo.setStockInfo(rs.getString("stockInfo"));
		sbo.setTaxID(rs.getString("taxId"));
		sbo.setUserName(rs.getString("username"));
		return sbo;
	}

}
