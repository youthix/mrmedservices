package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.CustomerBO;
import org.springframework.jdbc.core.RowMapper;

public class CustomerBOMapper implements RowMapper<CustomerBO>{

	@Override
	public CustomerBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		CustomerBO cbo= new CustomerBO();		
		cbo.setActive(rs.getString("active"));
		cbo.setAdd(rs.getString("address"));
		cbo.setAge(rs.getString("age"));
		cbo.setConNu(rs.getString("contactNo"));
		cbo.setCusID(rs.getString("cusID"));
		cbo.setEmail(rs.getString("email"));
		cbo.setfName(rs.getString("firstName"));
		cbo.setGender(rs.getString("gender"));
		cbo.setjDate(rs.getString("joiningDate"));
		cbo.setLastSeen(rs.getString("lastSeen"));
		cbo.setlName(rs.getString("lastName"));
		cbo.setlNo(rs.getString("dlNo"));		
		cbo.setPan(rs.getString("pan"));
		cbo.setTin(rs.getString("tin"));
		cbo.setCusTy(rs.getString("type"));
		return cbo;
	}
}
