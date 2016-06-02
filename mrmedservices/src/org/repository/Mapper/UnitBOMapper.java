package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.UnitBO;
import org.springframework.jdbc.core.RowMapper;

public class UnitBOMapper implements RowMapper<UnitBO>{

	@Override
	public UnitBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UnitBO ubo= new UnitBO();
		ubo.setActive(rs.getString("active"));
		ubo.setUnitDet(rs.getString("unitDetails"));
		ubo.setUnitID(rs.getString("unitId"));
		return ubo;
	}

}
