package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.GeoTaggingBO;
import org.springframework.jdbc.core.RowMapper;

public class GeoTaggingBOMapper implements RowMapper<GeoTaggingBO>{

	@Override
	public GeoTaggingBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		GeoTaggingBO gbo= new GeoTaggingBO();
		gbo.setAreaCode(rs.getString("areacode"));
		gbo.setDbList(rs.getString("dblist"));
		gbo.setSqlSer(rs.getString("sqlserver"));
		return gbo;
	}

}
