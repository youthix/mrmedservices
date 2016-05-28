package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.PaymentBO;
import org.springframework.jdbc.core.RowMapper;

public class PaymentBOMapper implements RowMapper<PaymentBO>{

	@Override
	public PaymentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PaymentBO pbo= new PaymentBO();
		pbo.setActive(rs.getString("active"));
		pbo.setDetails(rs.getString("details"));
		pbo.setModeID(rs.getString("modeId"));
		pbo.setPayDate(rs.getString("payDate"));
		pbo.setPayID(rs.getString("paymentId"));
		pbo.setRemarks(rs.getString("remarks"));
		return pbo;
	}

}
