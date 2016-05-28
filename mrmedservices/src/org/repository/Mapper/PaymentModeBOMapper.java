package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.PaymentModeBO;
import org.springframework.jdbc.core.RowMapper;

public class PaymentModeBOMapper implements RowMapper<PaymentModeBO>{

	@Override
	public PaymentModeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		PaymentModeBO pmbo= new PaymentModeBO();
		pmbo.setActive(rs.getString("active"));
		pmbo.setModeDet(rs.getString("modeDetails"));
		pmbo.setModeID(rs.getString("modeId"));
		return pmbo;
	}
	

}
