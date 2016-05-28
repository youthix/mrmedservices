package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.CompanyBO;
import org.springframework.jdbc.core.RowMapper;

public class CompanyBOMapper implements RowMapper<CompanyBO>{

	@Override
	public CompanyBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CompanyBO cbo= new CompanyBO();
		cbo.setComID(rs.getString("companyID"));
		cbo.setComName(rs.getString("companyName"));
		cbo.setComURL(rs.getString("companyUrl"));
		cbo.setContNo(rs.getString("contactNo"));
		cbo.setContPerson(rs.getString("contactPerson"));
		cbo.setEmail(rs.getString("email"));
		cbo.setLogo(rs.getString("logo"));
		cbo.setProfile(rs.getString("profile"));
		return cbo;
	}

}
