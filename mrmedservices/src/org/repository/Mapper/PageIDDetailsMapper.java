/**
 * 
 */
package org.repository.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.repository.BObjects.Page;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author surabh
 *
 */
public class PageIDDetailsMapper implements RowMapper<Page>{

	public Page mapRow(ResultSet rs, int rowNum) throws SQLException {
		Page pageObj = new Page();

		pageObj.setFbIds(rs.getString("fbids"));
		pageObj.setId(rs.getString("page_id"));
		pageObj.setTable(rs.getString("table"));

		return pageObj;
	}
}
