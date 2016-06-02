package org.repository.DAOInterface;

import java.util.List;

import javax.sql.DataSource;

import org.repository.BObjects.IndexingInfo;
import org.repository.BObjects.Page;
import org.repository.BObjects.TagPage;
import org.repository.BObjects.User;
import org.repository.BObjects.UserBO;

public interface UserDAOInterface {
	

	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	    void setDataSource(DataSource ds);
	    
	    void saveUser(UserBO ubo,String dbName);
	    
	    List<UserBO> getUsers(UserBO ubo,String dbName);
	    
	    List<UserBO> doLogin(UserBO ubo,String dbName);
	    
	    void updateUserLastSeen(UserBO ubo,String dbName);

}
