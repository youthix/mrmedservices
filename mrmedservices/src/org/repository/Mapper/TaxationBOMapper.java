package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.TaxationBO;
import org.springframework.jdbc.core.RowMapper;

public class TaxationBOMapper implements RowMapper<TaxationBO>{

	@Override
	public TaxationBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		TaxationBO tbo= new TaxationBO();
		tbo.setActive(rs.getString("active"));
		tbo.setTaxAmt(rs.getString("taxAmount"));
		tbo.setTaxDet(rs.getString("taxDetails"));
		tbo.setTaxID(rs.getString("taxId"));
		return tbo;
	}


}
