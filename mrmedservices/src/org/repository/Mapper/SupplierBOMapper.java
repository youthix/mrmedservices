package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.SupplierBO;
import org.springframework.jdbc.core.RowMapper;

public class SupplierBOMapper implements RowMapper<SupplierBO>{

	@Override
	public SupplierBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		SupplierBO sbo= new SupplierBO();
		sbo.setActive(rs.getString("active"));
		sbo.setAdd(rs.getString("address"));
		sbo.setAge(rs.getString("age"));
		sbo.setConNu(rs.getString("contactNo"));
		sbo.setSuppID(rs.getString("supplierId"));
		sbo.setEmail(rs.getString("email"));
		sbo.setfName(rs.getString("firstName"));
		sbo.setGender(rs.getString("gender"));
		sbo.setjDate(rs.getString("joiningDate"));
		sbo.setLastSeen(rs.getString("lastSeen"));
		sbo.setlName(rs.getString("lastName"));
		sbo.setlNo(rs.getString("dlNo"));		
		sbo.setPan(rs.getString("pan"));
		sbo.setTin(rs.getString("tin"));
		sbo.setSuppTy(rs.getString("type"));
		return sbo;
	}

}
