package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.CatBO;
import org.repository.BObjects.UnitBO;
import org.springframework.jdbc.core.RowMapper;

public class CatBOMapper implements RowMapper<CatBO>{

	@Override
	public CatBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CatBO cabo= new CatBO();
		cabo.setActive(rs.getString("active"));
		cabo.setCatDet("detail");
		cabo.setCatID("id");
		return cabo;
	}

}
