
package org.repository.DAOImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.repository.BObjects.IndexingInfo;
import org.repository.BObjects.Page;
import org.repository.BObjects.TagPage;
import org.repository.BObjects.User;
import org.repository.BObjects.UserBO;
import org.repository.DAOInterface.UserDAOInterface;
import org.repository.Mapper.IndexingInfoMapper;
import org.repository.Mapper.PageIDDetailsMapper;
import org.repository.Mapper.TagsPageIDMapper;
import org.repository.Mapper.UserBOMapper;
import org.repository.Mapper.UserMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author saurabh
 *
 */
public class UserJDBCTemplate implements UserDAOInterface {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveUser(UserBO ubo,String dbName) {
		String SQL="select * from "+dbName+".user where username='"+ubo.getUserName()+"'";
		List<UserBO> users=jdbcTemplateObject.query(SQL, new UserBOMapper());
		if(null !=users && users.size()>0){
			updateUser( ubo, dbName);
		}
		else{
			createUser( ubo, dbName);
		}
		return;
	}
	
	@Override
	public List<UserBO> getUsers(UserBO ubo,String dbName) {
		String SQL="select count(*) from "+dbName+".user where username='"+ubo.getUserName()+"' or contactNo='"+ubo.getConNu()+"'";
		List<UserBO> users=jdbcTemplateObject.query(SQL, new UserBOMapper());
		return users;
	}
	
	
	private void updateUser(UserBO ubo,String dbName){
		String SQL="update "+ dbName +".user set "
				+"`password`='"+ubo.getPwd()+"',"	
				+"`firstName`='"+ubo.getfName()+"',"
				+"`lastName`='"+ubo.getlName()+"',"
				+"`gender`='"+ubo.getGender()+"',"
				+"`age`='"+ubo.getAge()+"',"
				+"`address`='"+ubo.getAdd()+"',"
				+"`contactNo`='"+ubo.getConNu()+"',"
				+"`email`='"+ubo.getEmail()+"',"
				+"`uniqueId`='"+ubo.getuId()+"',"
				+"`role`='"+ubo.getRole()+"',"
				+"`loginStatus`='"+ubo.getLoginSt()+"',"
				+"`lastSeentimestamp`= CURRENT_TIMESTAMP,"
				+"`active`='"+ubo.getActive()+"' "
				+"where username='"+ubo.getUserName()+"'";
		jdbcTemplateObject.update(SQL);
	}
	
	private void createUser(UserBO ubo,String dbName){
		String SQL="insert into " + dbName +".user"
				+ " (`username`,`password`,`firstName`,`lastName`,`gender`,"
				+ "`age`,`address`,`contactNo`,`email`,`uniqueId`,`role`) values ("
				+"'"+ubo.getUserName()+"',"
				+"'"+ubo.getPwd()+"',"
				+"'"+ubo.getfName()+"',"
				+"'"+ubo.getlName()+"',"
				+"'"+ubo.getGender()+"',"
				+"'"+ubo.getAge()+"',"
				+"'"+ubo.getAdd()+"',"
				+"'"+ubo.getConNu()+"',"
				+"'"+ubo.getEmail()+"',"
				+"'"+ubo.getuId()+"',"
				+"'"+ubo.getRole()+"'"
				+ ")"	;
		jdbcTemplateObject.update(SQL);
	}

}
