package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.PurchaseBO;
import org.springframework.jdbc.core.RowMapper;

public class PurchaseBOMapper implements RowMapper<PurchaseBO>{

	@Override
	public PurchaseBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PurchaseBO pbo= new PurchaseBO();
		pbo.setActive(rs.getString("active"));
		pbo.setAddDisc(rs.getString("addDiscount"));
		pbo.setPurID(rs.getString("purchaseId"));
		pbo.setDisc(rs.getString("discount"));
	    pbo.setGrossAmt(rs.getString("grossAmount"));
		pbo.setInvDet(rs.getString("invDetails"));
		pbo.setNetAmt(rs.getString("netAmount"));
		pbo.setPayInfo(rs.getString("paymentInfo"));
		pbo.setPaymentStat(rs.getString("paymentStatus"));
		pbo.setRemarks(rs.getString("remarks"));
		pbo.setPurDt(rs.getString("purchaseDate"));
		pbo.setSuppID(rs.getString("supplierId"));
		pbo.setStockInfo(rs.getString("stockInfo"));
		pbo.setTaxID(rs.getString("taxId"));
		pbo.setUserName(rs.getString("username"));
		return pbo;
	}

}
