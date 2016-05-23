package org.presentation.controller.Interface;

import org.presentation.entities.RequestObj;
import org.presentation.entities.ResponseObj;


public interface RESTfulServiceInterface {
	
	ResponseObj fetchPages(RequestObj reqparam);
	
	ResponseObj fetchUsers(RequestObj reqparam);
	
	ResponseObj fetchUserCount(RequestObj reqparam);
	
	ResponseObj registerUser(RequestObj reqparam);
	
	ResponseObj deleteUser(RequestObj reqparam);
	
	ResponseObj logout(String fbId);
	
	String helloWorld();

	String doIndexing(String username, 
			String password, String dbQualifiers);	
}
