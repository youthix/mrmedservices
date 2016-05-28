package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.UserBO;
import org.springframework.jdbc.core.RowMapper;

public class UserBOMapper implements RowMapper<UserBO>{

	@Override
	public UserBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserBO ubo= new UserBO();
		ubo.setActive(rs.getString("active"));
		ubo.setAdd(rs.getString("address"));
		ubo.setAge(rs.getString("age"));
		ubo.setConNu(rs.getString("contactNo"));
		ubo.setUserName(rs.getString("username"));
		ubo.setEmail(rs.getString("email"));
		ubo.setfName(rs.getString("firstName"));
		ubo.setGender(rs.getString("gender"));
		ubo.setjDate(rs.getString("joiningDate"));
		ubo.setLastSeen(rs.getString("lastSeen"));
		ubo.setlName(rs.getString("lastName"));
		ubo.setRole(rs.getString("role"));		
		ubo.setLoginSt(rs.getString("loginStatus"));
		ubo.setPwd(rs.getString("password"));		
		return ubo;
	}

}
